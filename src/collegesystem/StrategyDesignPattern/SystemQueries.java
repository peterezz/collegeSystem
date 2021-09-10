/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegesystem.StrategyDesignPattern;

import collegesystem.Course;
import collegesystem.Student;

/**
 *
 * @author Ahmed
 */
public interface SystemQueries {

    public void add(Student x,Course y);

    public boolean delete(String id);


    boolean update(String oldID, Student x,Course y);
    int getIndex(String id);
    boolean uniqueid(String id);

    

}
