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
public class StudentQueries implements SystemQueries {
    ArrayList<Student> list=UserFactory.getInstance().students;

    public StudentQueries() {
    }

    @Override
    public void add(Student x, Course y) {
        list.add(x);
    }

    @Override
    public boolean delete(String id) {
         int index = getIndex(id);
        if (index != -1) {
            list.remove(index);
            return true;
        }
        return false; 
        
    }

    @Override
    public boolean update(String oldID, Student x, Course y) {
         int index = getIndex(oldID);
        if (index != -1) {
            list.set(index, x);
            return true;
        }
        return false;
    }

    @Override
    public int getIndex(String id) {
         for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(id)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public boolean uniqueid(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(id)) {
                return false;
            }
        }

        return true;
    }
    }

  
    

