/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegesystem;

import collegesystem.Factory_SingltonDesignPattern.UserFactory;
import collegesystem.ObserverDesignPattern.observer;
import collegesystem.ObserverDesignPattern.subject;
import collegesystem.StrategyDesignPattern.SystemQueries;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ahmed
 */
public class Course implements subject {

    private String courseID, coursename;
    private String Avilability,courseAvailablity;
    SystemQueries systemQueries;
    private List<observer> observerList;
    private ArrayList<Course> List = UserFactory.getInstance().courses;

    public Course(String courseID, String coursename, String Avilability, SystemQueries systemQueries) {
        this.courseID = courseID;
        this.coursename = coursename;
        this.Avilability = Avilability;
        this.systemQueries = systemQueries;
        observerList = new ArrayList<>();
    }

    public Course(SystemQueries systemQueries) {
        this.systemQueries = systemQueries;
    }

    public Course() {
        observerList = new ArrayList<>();
    }

   

    public Course(String courseID, String coursename,String Available) {
        this.courseID = courseID;
        this.coursename = coursename;
        this.Avilability=Available;
        observerList = new ArrayList<>();
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCoursename() {
        return coursename;
    }

    public String getAvilability() {
        return Avilability;
    }

    
          


    
         private int getCourseIndex(String id) {
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).getCourseID().equals(id)) {
                return i;
            }
        }

        return -1;
    }
          public Course searchCourseById(String id) {
        Course temp = null;
       
        int index = getCourseIndex(id);
        if (index != -1) {
            return List.get(index);
        } else {
            return temp;
        }
    }

    public void setAvilability(String Avilability) {
        this.Avilability = Avilability;
    }

    public void addCourse() {
        this.systemQueries.add(null, this);
    }

    public boolean deleteCoure(String CourseID) {
        return this.systemQueries.delete(CourseID);
    }

    public boolean updateCourse(String CourseID) {
        return this.systemQueries.update(CourseID, null, this);
    }

    public boolean setid(String CourseID) {
        return this.systemQueries.uniqueid(CourseID);
    }

    @Override
    public void subscribe(observer Observer) {
        observerList.add(Observer);
    }

    @Override
    public void unsubscribe(observer Observer) {
        observerList.remove(Observer);
    }

    @Override
    public void notifyAllSubscribers() {
        for (observer Observer : observerList) {
            Observer.getNotification(courseAvailablity);
        }
    }
     public void setAvailability() {
        if (getAvilability().equals("Available")) {
            courseAvailablity = this.coursename + " is Available";
        } else if (getAvilability().equals("NotAvailable")) {
            courseAvailablity = this.coursename + " is NOT Available";

        }

        notifyAllSubscribers();
    }

}
