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
public class Car {
    private Chassi chassi;
    private Wheel rightFront;
    private Wheel leftFront; 
    private Wheel leftBack;
    private Wheel rightBack;
    private Transmission transmission;
    private Engine engine ;

    Car(Chassi c, Wheel lf, Wheel rf, Wheel lb, Wheel rb, Transmission T, Engine E) {
        chassi = c;
        rightFront = rf;
        rightBack = rb;
        leftFront = lf;
        leftBack = lb;
        engine = E;
        transmission = T;
    }

    boolean getStatus() {
        if(chassi!=null && rightFront != null && leftFront != null 
                && leftBack != null && rightBack != null && engine != null 
                &&  transmission != null){
            boolean x1,x2,x3,x4,x5,x6,x7 = false;
            x1 = transmission.getStatus();
            x2 = leftBack.getStatus();
            x3 = rightBack.getStatus();
            x4 = leftFront.getStatus();
            x5 = rightFront.getStatus();
            x6 = chassi.getStatus();
            x7 = engine.getStatus();
//        x1 && x2 && x3 && x4 && x5 && x6 &&
            if(x1 && x2 && x3 && x4 && x5 && x6 && x7)
                return true;
        }
        return false;
    }

    void startCar() {
        engine.fireStartMotor();
    }

    void stopCar() {
        engine.fireStartMotor();
    }
    
}
