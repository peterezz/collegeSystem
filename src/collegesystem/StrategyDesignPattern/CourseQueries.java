/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegesystem.StrategyDesignPattern;

import collegesystem.Course;
import collegesystem.Factory_SingltonDesignPattern.UserFactory;
import collegesystem.Student;
import java.util.ArrayList;

/**
 *
 * @author Ahmed
 */
public class CourseQueries implements SystemQueries {
    ArrayList<Course> List=UserFactory.getInstance().courses;

    public CourseQueries() {
    }

    @Override
    public void add(Student x, Course y) {
        List.add(y);
    }

    @Override
    public boolean delete(String id) {
        int index = getIndex(id);
        if (index != -1) {
            List.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(String oldID, Student x, Course y) {
        int index = getIndex(oldID);
        if (index != -1) {
            List.set(index, y);
            return true;
        }
        return false;
    }

    @Override
    public int getIndex(String id) {
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).getCourseID().equals(id)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public boolean uniqueid(String id) {
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).getCourseID().equals(id)) {
                return false;
            }
        }

        return true;
    }
}
