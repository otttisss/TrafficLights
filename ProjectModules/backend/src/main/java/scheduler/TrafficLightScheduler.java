package scheduler;

import interfaces.TrafficLight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TrafficLightScheduler {
    @Autowired
    private TrafficLight trafficLight;

    @Scheduled(fixedDelay = 5000) // Задержка 5 сек
    public void automaticMode() {
        trafficLight.switchToRed();
        trafficLight.switchToGreen();
        trafficLight.switchToYellow();
    }
}
