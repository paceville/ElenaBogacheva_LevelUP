package homeworks_3and4.task_1.modeOfTransport;
//import homeworks_3and4.task_1.modeOfTransport.MulticoptersType;

import homeworks_3and4.task_1.properties.Containable;
import homeworks_3and4.task_1.properties.Flyable;

public class Multicopter extends Aircraft implements Containable, Flyable {

    Object model;
    String name;

    public Multicopter (Object model, int flightDistance) {
        this.model = model;
        this.flightDistance = flightDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void capacity() {
    }

    @Override
    public void flightAltitude() {
    }

    @Override
    public String toString() {
        return "Multicopter{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Multicopter that = (Multicopter) o;

        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
