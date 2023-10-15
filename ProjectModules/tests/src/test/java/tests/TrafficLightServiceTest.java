package tests;

import interfaces.TrafficLightsService;
import org.junit.Test;
import services.TrafficLightServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TrafficLightServiceTest {
    @Test
    public void testSetMode() {
        TrafficLightServiceImpl service = new TrafficLightServiceImpl();
        service.setMode("manual");
        assertEquals("manual", service.getCurrentMode());
    }
}
