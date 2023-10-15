package com.example.trafficlight;

import org.junit.Test;
import com.example.trafficlight.repository.TrafficLightLocalRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrafficLocalRepositoryTest {
    @Test
    public void testSaveState() {
        TrafficLightLocalRepository repository = new TrafficLightLocalRepository();
        repository.saveState("red");
        assertEquals("red", repository.getCurrentState());
    }
}
