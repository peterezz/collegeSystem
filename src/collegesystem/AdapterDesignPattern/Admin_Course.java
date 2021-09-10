/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegesystem.AdapterDesignPattern;

import collegesystem.Course;

/**
 *
 * @author Peter
 */
public class Admin_Course implements admin_adapter {

    Course course;

    public Admin_Course(Course course) {
        this.course = course;
    }

    @Override
    public void addNewCourse(String Avilability, String CName, String CId) {
        course.setCourseID(CId);
        course.setCoursename(CName);
        course.setAvilability(Avilability);
        course.addCourse();
    }

    @Override
    public boolean updateCourse(String oldID) {
        return course.updateCourse(oldID);
    }

    @Override
    public boolean deleteCourse(String Id) {
        return course.deleteCoure(Id);
    }

    @Override
    public boolean setId(String ID) {
return course.setid(ID);    }

}
