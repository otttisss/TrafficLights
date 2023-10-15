package services;

import interfaces.TrafficLight;
import interfaces.TrafficLightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import interfaces.TrafficLightsService;

@Service
@Component
public class TrafficLightServiceImpl implements TrafficLightsService{
    @Autowired
    private TrafficLightRepository trafficLightRepository;
    @Autowired
    private TrafficLight trafficLight;

    @Override
    public void setMode(String mode) {
        trafficLightRepository.saveState(mode);
    }

    @Override
    public String getCurrentMode() {
        return trafficLightRepository.getCurrentState();
    }
}
