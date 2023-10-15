package com.example.trafficlight.interfaces;

public interface TrafficLightRepository {
    String getCurrentState();
    void saveState(String state);
}
