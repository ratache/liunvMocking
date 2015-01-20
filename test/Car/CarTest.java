/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author UndeadAmilo
 */
public class CarTest {
    private Chassi mockChassi;
    private Wheel mockLf;
    private Wheel mockRf; 
    private Wheel mockLb;
    private Wheel mockRb;
    private Transmission mockT;
    private Engine mockEngine ;
    private Car SUT;
    
    @Before
    public void setUp() {
        mockChassi = mock(Chassi.class);
        mockLf = mock(Wheel.class);
        mockRf = mock(Wheel.class);
        mockLb = mock(Wheel.class);
        mockRb = mock(Wheel.class);
        mockT = mock(Transmission.class);
        mockEngine = mock(Engine.class);
        SUT = new Car(mockChassi, mockLf, mockRf, mockLb, mockRb, mockT, mockEngine);   
    }

    @Test
    public void testBuildtCar() {
        assertEquals(SUT.getStatus(), true);
    }
    
}
