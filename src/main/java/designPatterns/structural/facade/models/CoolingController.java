package designPatterns.structural.facade.models;

public class CoolingController {
    public void setTemperatureUpperLimit(int defaultCoolingTemp) {
        System.out.println("TemperatureUpperLimit is set to "+ defaultCoolingTemp);
    }

    public void stop() {
    }

    public void cool(int maxAllowedTemp) {
    }

    public void run() {
    }
}
