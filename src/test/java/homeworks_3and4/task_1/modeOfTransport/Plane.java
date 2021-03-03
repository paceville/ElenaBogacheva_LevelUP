package homeworks_3and4.task_1.modeOfTransport;

import homeworks_3and4.task_1.properties.Containable;
import homeworks_3and4.task_1.properties.Flyable;

public class Plane extends Aircraft implements Containable, Flyable {

    String name;
    int maxPlacesInTheSalon;
    int maxCargoMass;
    int maxFlightAltitude;
    int maxTakeoffMass;

    public Plane(PlaneType model, int flightDistance) {
        super.flightDistance = flightDistance;
        super.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxFlightAltitude() {
        return maxFlightAltitude;
    }

    public void setMaxFlightAltitude(int maxFlightAltitude) {
        this.maxFlightAltitude = maxFlightAltitude;
    }

    public int getMaxPlacesInTheSalon() {
        return maxPlacesInTheSalon;
    }

    public void setMaxPlacesInTheSalon(int maxPlacesInTheSalon) {
        this.maxPlacesInTheSalon = maxPlacesInTheSalon;
    }

    public int getMaxCargoMass() {
        return maxCargoMass;
    }

    public void setMaxCargoMass(int maxCargoMass) {
        this.maxCargoMass = maxCargoMass;
    }

    public int getMaxTakeoffMass() {
        return maxTakeoffMass;
    }

    public void setMaxTakeoffMass(int maxTakeoffMass) {
        this.maxTakeoffMass = maxTakeoffMass;
    }

//    public void setPlaneName(String name) {
//        try {
//            setName(name);
//        } catch (NullPointerException e) {
//            System.err.println("Some object is not definiert: " + e);
//        }
//    }

    @Override
    public void capacity() {
        System.out.println("The maximum cargo weight is: " + getMaxCargoMass() + " tons");
        System.out.println("Maximum amount of passengers is: " + getMaxPlacesInTheSalon());
        System.out.println("The maximum takeoff mass is: " + getMaxTakeoffMass() + " kg");
    }

    @Override
    public void flightAltitude() {
        System.out.println("The highest altitude is: " + getMaxFlightAltitude() + " m");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", maxPlacesInTheSalon=" + maxPlacesInTheSalon +
                ", maxCargoMass=" + maxCargoMass +
                ", maxFlightAltitude=" + maxFlightAltitude +
                ", maxTakeoffMass=" + maxTakeoffMass +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plane plane = (Plane) o;

        if (maxPlacesInTheSalon != plane.maxPlacesInTheSalon) return false;
        if (maxCargoMass != plane.maxCargoMass) return false;
        if (maxFlightAltitude != plane.maxFlightAltitude) return false;
        if (maxTakeoffMass != plane.maxTakeoffMass) return false;
        return name != null ? name.equals(plane.name) : plane.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + maxPlacesInTheSalon;
        result = 31 * result + maxCargoMass;
        result = 31 * result + maxFlightAltitude;
        result = 31 * result + maxTakeoffMass;
        return result;
    }
}
