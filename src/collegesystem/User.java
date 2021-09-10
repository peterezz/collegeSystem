/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegesystem;

/**
 *
 * @author Ahmed
 */
public abstract class User {
    private String username,pass,firstname,lastname,status;
    private int age;

    public User(String username, String pass, String firstname, String lastname, String status, int age) {
        this.username = username;
        this.pass = pass;
        this.firstname = firstname;
        this.lastname = lastname;
        this.status = status;
        this.age = age;
    }

    public User(String username) {
        this.username = username;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getStatus() {
        return status;
    }

    public int getAge() {
        return age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public abstract boolean login(String UserName,String Pass);
    
}
