package services;

import interfaces.TrafficLight;
import org.springframework.stereotype.Component;

@Component
public class TrafficLightImpl implements TrafficLight {

    private String currentState = "red";
    @Override
    public void switchToRed() {
        currentState = "red";
    }

    @Override
    public void switchToGreen() {
        currentState = "green";
    }

    @Override
    public void switchToYellow() {
        currentState = "yellow";
    }
}
