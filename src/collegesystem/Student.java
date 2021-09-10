/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegesystem;

import collegesystem.Factory_SingltonDesignPattern.UserFactory;
import collegesystem.ObserverDesignPattern.observer;
import collegesystem.StrategyDesignPattern.SystemQueries;
import java.util.ArrayList;

/**
 *
 * @author Ahmed
 */
public class Student extends User implements observer {

    private SystemQueries systemQueries;
    private double gba;
    private int level;
    private String notification;
    ArrayList<Student> list = UserFactory.getInstance().students;

    public Student(SystemQueries systemQueries) {
        this.systemQueries = systemQueries;
    }

    public Student(SystemQueries systemQueries, double gba, int level, String username, String pass, String firstname, String lastname, String status, int age) {
        super(username, pass, firstname, lastname, status, age);
        this.systemQueries = systemQueries;
        this.gba = gba;
        this.level = level;
    }

    public Student() {

    }

    @Override
    public boolean login(String UserName, String Pass) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(UserName) && list.get(i).getPass().equals(Pass)) {
                return true;
            }
        }

        return false;
    }

    public void addStudent() {
        this.systemQueries.add(this, null);
    }

    public boolean updateStudent(String OldID) {
        return this.systemQueries.update(OldID, this, null);
    }

    public boolean setid() {
        return this.systemQueries.uniqueid(this.getUsername());
    }

    public boolean deleteStudent(String id) {
        return this.systemQueries.delete(id);
    }

    public String getNotification() {
        return notification;
    }

    @Override
    public void getNotification(String massage) {
        this.notification = massage;
    }

}
