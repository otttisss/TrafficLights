package tests;

import interfaces.TrafficLight;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class TrafficLightTest {
    @Test
    public void testSwitchToRed() {
        TrafficLight trafficLight = mock(TrafficLight.class);
        trafficLight.switchToRed();
        verify(trafficLight).switchToRed();
    }
}
