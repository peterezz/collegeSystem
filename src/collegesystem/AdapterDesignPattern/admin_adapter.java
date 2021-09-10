/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegesystem.AdapterDesignPattern;

/**
 *
 * @author Peter
 */
public interface admin_adapter {
    public void addNewCourse(String Avilability, String CName,String CId );
   
    
    
    
     public boolean updateCourse(String oldID );
     public boolean deleteCourse(String Id);
     public boolean setId(String ID);
    
}
