package com.example.trafficlight.repository;

import com.example.trafficlight.interfaces.TrafficLightRepository;
import org.springframework.stereotype.Repository;


@Repository
public class TrafficLightLocalRepository implements TrafficLightRepository {
    private String currentState;

    @Override
    public String getCurrentState() {
        return currentState;
    }

    @Override
    public void saveState(String state) {
        currentState = state;
    }
}
