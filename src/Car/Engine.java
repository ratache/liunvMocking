/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author UndeadAmilo
 */
public class Engine {
    boolean started = false;
    
    boolean startEngine(){
        if(!started){
            return true;
        }
        return false;
    }

    boolean stopEngine() {
        return false;
    }
    
}
