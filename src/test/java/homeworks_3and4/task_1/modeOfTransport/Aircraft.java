package homeworks_3and4.task_1.modeOfTransport;

import homeworks_3and4.task_1.properties.Containable;
import homeworks_3and4.task_1.properties.Flyable;

public abstract class Aircraft implements Containable, Flyable {
    Object model;
    int flightDistance;

    public Object getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFlightDistance() {
        return flightDistance;
    }

    public void setFlightDistance(int flightDistance) {
        this.flightDistance = flightDistance;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "model=" + model +
                ", flightDistance=" + flightDistance +
                '}';
    }
}
