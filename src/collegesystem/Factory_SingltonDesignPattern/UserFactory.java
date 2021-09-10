/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegesystem.Factory_SingltonDesignPattern;

import collegesystem.User;

import collegesystem.Admin;
import collegesystem.Course;
import collegesystem.Student;
import java.util.ArrayList;

/**
 *
 * @author Ahmed
 */
public class UserFactory {
     private static UserFactory instance;

    private UserFactory() {
    }
     public static UserFactory getInstance ()
    {
        if( instance == null)
        {
            instance = new UserFactory();
        }
        return instance;
    }
     public  ArrayList<Student> students = new ArrayList<Student>();
     public  ArrayList<Course> courses = new ArrayList<Course>();

    public  String student = "Students";

    public  String admin = "admin";

    public  User usercreation(String Usertybe) {
        switch (Usertybe) {
            case "Students":
                return new Student();
       
            case "admin":
                return new Admin();
            default:
                return null;

        }
    }

}
