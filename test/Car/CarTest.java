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
        
        when(mockRb.getStatus()).thenReturn(true);
        when(mockLb.getStatus()).thenReturn(true);
        when(mockLf.getStatus()).thenReturn(true);
        when(mockRf.getStatus()).thenReturn(true);
        when(mockChassi.getStatus()).thenReturn(true);
        when(mockT.getStatus()).thenReturn(true);
        when(mockEngine.getStatus()).thenReturn(true);
    }

    @Test
    public void testBuildtCar() {
        assertEquals(true, SUT.getStatus());
    }
    
    @Test
    public void testEngine(){
        when(mockEngine.fireStartMotor()).thenReturn(true);
        
        SUT.startCar();
        SUT.stopCar();
        SUT.getStatus();
        
        verify(mockEngine, times(2)).fireStartMotor();
        
        verify(mockLb, times(1)).getStatus();
        verify(mockRb, times(1)).getStatus();
        verify(mockLf, times(1)).getStatus();
        verify(mockRf, times(1)).getStatus();
        verify(mockChassi, times(1)).getStatus();
        verify(mockT, times(1)).getStatus();
    }
    
}
