/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegesystem.ObserverDesignPattern;

/**
 *
 * @author ahmed
 */
public interface subject {
     void subscribe(observer Observer);
    void unsubscribe(observer Observer);
    void notifyAllSubscribers();
    
}
