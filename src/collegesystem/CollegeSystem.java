/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegesystem;

import collegesystem.AdapterDesignPattern.Admin_Course;
import collegesystem.Factory_SingltonDesignPattern.UserFactory;
import collegesystem.GUI.Login;
import collegesystem.StrategyDesignPattern.CourseQueries;
import java.util.ArrayList;

/**
 *
 * @author Peter
 */
public class CollegeSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Admin_Course yz = new Admin_Course(new Course(new CourseQueries()));
        yz.addNewCourse("NotAvailable", "aa", "SA");
        Course course = new Course().searchCourseById("SA");
        Course cours1=new Course(course.getCourseID(),course.getCoursename(),course.getAvilability());
        Student y = new Student();

        cours1.subscribe(y);
        cours1.setAvailability();
        System.out.println(y.getNotification());
*/
        new Login().setVisible(true);

    }

}
