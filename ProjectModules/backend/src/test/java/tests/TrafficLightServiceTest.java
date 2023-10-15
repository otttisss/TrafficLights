package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import services.TrafficLightServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TrafficLightServiceImpl.class)
@ComponentScan(basePackages = "services")
public class TrafficLightServiceTest {
    @Autowired
    TrafficLightServiceImpl trafficLightService;

    @Test
    public void testSetMode() {
        trafficLightService.setMode("manual");
        assertEquals("manual", trafficLightService.getCurrentMode());
    }
}
