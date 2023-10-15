package tests;

import org.junit.Test;
import repository.TrafficLightLocalRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrafficLocalRepositoryTest {
    @Test
    public void testSaveState() {
        TrafficLightLocalRepository repository = new TrafficLightLocalRepository();
        repository.saveState("red");
        assertEquals("red", repository.getCurrentState());
    }
}
