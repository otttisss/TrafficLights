package com.example.trafficlight.controllers;

import com.example.trafficlight.interfaces.TrafficLight;
import com.example.trafficlight.interfaces.TrafficLightsService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
public class TrafficLightController {
    @Autowired
    private TrafficLight trafficLight;
    @Autowired
    private TrafficLightsService trafficLightsService;

    @GetMapping("/current-state")
    public String getCurrentState(){
        return trafficLightsService.getCurrentMode();
    }

    @PostMapping("/set-mode")
    public void setMode(@RequestParam String mode) {
        trafficLightsService.setMode(mode);
    }

    @PostMapping("/switch-red")
    public void switchToRed() {
        trafficLight.switchToRed();
    }

    @PostMapping("/switch-yellow")
    public void switchToYellow() {
        trafficLight.switchToYellow();
    }

    @PostMapping("/switch-green")
    public void switchToGreen() {
        trafficLight.switchToGreen();
    }
}
