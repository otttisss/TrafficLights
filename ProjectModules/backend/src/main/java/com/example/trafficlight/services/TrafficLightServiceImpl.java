package com.example.trafficlight.services;

import com.example.trafficlight.interfaces.TrafficLightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.trafficlight.interfaces.TrafficLightsService;

@Service
@Component
public class TrafficLightServiceImpl implements TrafficLightsService{
    private final TrafficLightRepository repository;

    @Autowired
    public TrafficLightServiceImpl(TrafficLightRepository repository) {
        this.repository = repository;
    }

    @Override
    public void setMode(String mode) {
        repository.saveState(mode);
    }

    @Override
    public String getCurrentMode() {
        return repository.getCurrentState();
    }
}
