package interfaces;

public interface TrafficLightRepository {
    String getCurrentState();
    void saveState(String state);
}
