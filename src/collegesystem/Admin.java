/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegesystem;

import collegesystem.AdapterDesignPattern.admin_adapter;



/**
 *
 * @author Ahmed
 */
public class Admin extends User implements admin_adapter{

    public Admin() {
    }
    
    

    

 


   

   

//    @Override
    public boolean login(String userName,String oass) {
        if (userName.equals("Administrator") && oass.equals("R00T@123")) {

            return true;
        }
        return false;
    }

    @Override
    public void addNewCourse(String Avilability, String CName, String CId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateCourse(String oldID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCourse(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setId(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
