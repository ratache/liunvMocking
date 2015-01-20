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
    boolean engineStatus = true;
    
    boolean fireStartMotor(){
        if(!started && engineStatus){
            started = true;
            return started;
        }
        started = false;
        return started;
    }

    boolean getStatus() {
        return engineStatus;
    }
    
}
