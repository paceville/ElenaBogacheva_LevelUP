package homeworks_3and4.task_1.airlines;

import homeworks_3and4.task_1.EmptyListException;
import homeworks_3and4.task_1.InputDataTypeException;
import homeworks_3and4.task_1.modeOfTransport.*;

import java.util.*;
import java.util.stream.Stream;

public class Airlines {
    AirlinesNames name;
    int yearOfFoundation;
    Boolean activity;
    String parentCompany;
    AirlineAlliance airlineAlliance;
    String headquarters;
    int fleetSize;
    int destinations;
    String keyPeople;
    int employees;
    HashMap<Plane, Integer> planesBase;
    int countOfAirbusses220;
    int countOfAirbusses320;
    int countOfAirbusses321;
    int countOfAirbusses330;
    int countOfAirbusses350;
    int countOfAirbusses380;
    int countOfBoeings737;
    int countOfBoeings747;
    int countOfBoeings767;
    int countOfBoeings777;

    public Airlines(AirlinesNames name, int destinations) {
        this.name = name;
        this.destinations = destinations;
    }

    public AirlinesNames getName() {
        return name;
    }

    public void setName(AirlinesNames name) {
        this.name = name;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public Boolean getActivity() {
        return activity;
    }

    public void setActivity(Boolean activity) {
        this.activity = activity;
    }

    public AirlineAlliance getAirlineAlliance() {
        return airlineAlliance;
    }

    public void setAirlineAlliance(AirlineAlliance airlineAlliance) {
        this.airlineAlliance = airlineAlliance;
    }

    public String getParentCompany() {
        return parentCompany;
    }

    public void setParentCompany(String parentCompany) {
        this.parentCompany = parentCompany;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public int getFleetSize() {
        return fleetSize;
    }

    public void setFleetSize(int fleetSize) {
        this.fleetSize = fleetSize;
    }

    public int getDestinations() {
        return destinations;
    }

    public void setDestinations(int destinations) {
        this.destinations = destinations;
    }

    public String getKeyPeople() {
        return keyPeople;
    }

    public void setKeyPeople(String keyPeople) {
        this.keyPeople = keyPeople;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public HashMap getPlanesBase() {
        return planesBase;
    }

    public void setPlanesBase(HashMap planesBase) {
        this.planesBase = planesBase;
    }


    public HashMap<Plane, Integer> planesBase(int countOfAirbusses220, int countOfAirbusses320, int countOfAirbusses321,
                                              int countOfAirbusses330, int countOfAirbusses350, int countOfAirbusses380,
                                              int countOfBoeings737, int countOfBoeings747, int countOfBoeings767, int countOfBoeings777) {

        Plane a220 = new Plane(PlaneType.A220, 14000);
        a220.setName("Airbus A220");
        a220.setMaxPlacesInTheSalon(210);
        a220.setMaxCargoMass(21);
        a220.setMaxTakeoffMass(200000);
        //a220.capacity();
        a220.setMaxFlightAltitude(11100);
        //a220.flightAltitude();

        Plane a320 = new Plane(PlaneType.A320, 16000);
        a320.setName("Airbus A320");
        a320.setMaxPlacesInTheSalon(235);
        a320.setMaxCargoMass(20);
        a320.setMaxTakeoffMass(242600);
        //a320.capacity();
        a320.setMaxFlightAltitude(11900);
        //a320.flightAltitude();

        Plane a321 = new Plane(PlaneType.A321, 17000);
        a321.setName("Airbus A321");
        a321.setMaxPlacesInTheSalon(240);
        a321.setMaxCargoMass(21);
        a321.setMaxTakeoffMass(260000);
        //a321.capacity();
        a321.setMaxFlightAltitude(12000);
        //a321.flightAltitude();

        Plane a330 = new Plane(PlaneType.A330, 9500);
        a330.setName("Airbus A330");
        a330.setMaxPlacesInTheSalon(150);
        a330.setMaxCargoMass(15);
        a330.setMaxTakeoffMass(190000);
        //a330.capacity();
        a330.setMaxFlightAltitude(10500);
        //a330.flightAltitude();

        Plane a350 = new Plane(PlaneType.A350, 8000);
        a350.setName("Airbus A350");
        a350.setMaxPlacesInTheSalon(175);
        a350.setMaxCargoMass(19);
        a350.setMaxTakeoffMass(236000);
        //a350.capacity();
        a350.setMaxFlightAltitude(11500);
        //a350.flightAltitude();

        Plane a380 = new Plane(PlaneType.A380, 17500);
        a380.setName("Airbus A380");
        a380.setMaxPlacesInTheSalon(180);
        a380.setMaxCargoMass(21);
        a380.setMaxTakeoffMass(250000);
        //a380.capacity();
        a380.setMaxFlightAltitude(9500);
        //a380.flightAltitude();

        Plane boeing737 = new Plane(PlaneType.BOEING_737, 15000);
        boeing737.setName("Boeing-737");
        boeing737.setMaxPlacesInTheSalon(185);
        boeing737.setMaxCargoMass(21);
        boeing737.setMaxTakeoffMass(245000);
        //boeing737.capacity();
        boeing737.setMaxFlightAltitude(11200);
        //boeing737.flightAltitude();

        Plane boeing747 = new Plane(PlaneType.BOEING_747, 12000);
        boeing747.setName("Boeing-747");
        boeing747.setMaxPlacesInTheSalon(190);
        boeing747.setMaxCargoMass(19);
        boeing747.setMaxTakeoffMass(230000);
        //boeing747.capacity();
        boeing747.setMaxFlightAltitude(11500);
        //boeing747.flightAltitude();

        Plane boeing767 = new Plane(PlaneType.BOEING_767, 8000);
        boeing767.setName("Boeing-767");
        boeing767.setMaxPlacesInTheSalon(170);
        boeing767.setMaxCargoMass(19);
        boeing767.setMaxTakeoffMass(235000);
        //boeing767.capacity();
        boeing767.setMaxFlightAltitude(12000);
        //boeing767.flightAltitude();

        Plane boeing777 = new Plane(PlaneType.BOEING_777, 11500);
        boeing777.setName("Boeing-777");
        boeing777.setMaxPlacesInTheSalon(195);
        boeing777.setMaxCargoMass(22);
        boeing777.setMaxTakeoffMass(245000);
        //boeing777.capacity();
        boeing777.setMaxFlightAltitude(11600);
        //boeing777.flightAltitude();

        HashMap<Plane, Integer> planeBase = new HashMap();
        planeBase.put(a220, countOfAirbusses220);
        planeBase.put(a320, countOfAirbusses320);
        planeBase.put(a321, countOfAirbusses321);
        planeBase.put(a330, countOfAirbusses330);
        planeBase.put(a350, countOfAirbusses350);
        planeBase.put(a380, countOfAirbusses380);
        planeBase.put(boeing737, countOfBoeings737);
        planeBase.put(boeing747, countOfBoeings747);
        planeBase.put(boeing767, countOfBoeings767);
        planeBase.put(boeing777, countOfBoeings777);

        return planeBase;
    }

    public void planesBaseForFinnair(Plane plane1, Plane plane2) {

        if (plane1 == null || plane2 == null) {
            throw new NullPointerException("Some plane is not definiert");
        }
        ArrayList<Plane> planeBaseFinnair = new ArrayList<>();
        planeBaseFinnair.add(plane1);
        planeBaseFinnair.add(plane2);
        System.out.println("Finnairs planes: " + planeBaseFinnair);
    }

    public HashMap<Aircraft, Integer> aircraftsBase(HashMap<Plane, Integer> planesBase, int countOfAmericanSportcopters, int countOfAgustaWestlands, int countOfBells,
                                              int countOfEurocopters, int countOfTricopters, int countOfQuadrocopters,
                                              int countOfHexacopters, int countOfOctocopters) throws EmptyListException {

        Helicopter americanSportcopter = new Helicopter(HelicoptersType.AMERICAN_SPORTSCOPTER, 81);
        americanSportcopter.setName("American Sportcopter");
        Helicopter agustaWestland = new Helicopter(HelicoptersType.AGUSTA_WESTLAND, 75);
        agustaWestland.setName("Agusta Westland");
        Helicopter bell = new Helicopter(HelicoptersType.BELL, 96);
        bell.setName("Bell");
        Helicopter eurocopter = new Helicopter(HelicoptersType.EUROCOPTER, 72);
        eurocopter.setName("Eurocopter");

        Multicopter tricopter = new Multicopter(MulticoptersType.TRICOPTER, 5);
        tricopter.setName("Tricopter");
        Multicopter quadrocopter = new Multicopter(MulticoptersType.QUADROCOPTER, 7);
        quadrocopter.setName("Quadrocopter");
        Multicopter hexacopter = new Multicopter(MulticoptersType.HEXACOPTER, 9);
        hexacopter.setName("Hexacopter");
        Multicopter octocopter = new Multicopter(MulticoptersType.OCTOCOPTER, 4);
        octocopter.setName("Octocopter");

        HashMap<Aircraft, Integer> aircraftsBase = new HashMap();

        if (planesBase == null) {
            throw new EmptyListException("PlanesBase is empty");
        }
        aircraftsBase.putAll(planesBase);

        aircraftsBase.put(americanSportcopter, countOfAmericanSportcopters);
        aircraftsBase.put(agustaWestland, countOfAgustaWestlands);
        aircraftsBase.put(bell, countOfBells);
        aircraftsBase.put(eurocopter, countOfEurocopters);
        aircraftsBase.put(tricopter, countOfTricopters);
        aircraftsBase.put(quadrocopter, countOfQuadrocopters);
        aircraftsBase.put(hexacopter, countOfHexacopters);
        aircraftsBase.put(octocopter, countOfOctocopters);

        return aircraftsBase;
    }

    public void flightDistance(HashMap<Aircraft, Integer> aircraftsbase) throws InputDataTypeException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What distance do you want to know? max/min");
        String maxOrMinDistance = scanner.next();

        if (!Stream.of("min", "max").anyMatch(maxOrMinDistance :: contains)) {
            throw new InputDataTypeException("Only values 'max' or 'min' are possible");
        }

        ArrayList<Integer> flightDistanceList = new ArrayList<>();
        for (int keys = 0; keys < aircraftsbase.size(); keys++) {
            for (Aircraft key : aircraftsbase.keySet()) {
                int distance = key.getFlightDistance();
                flightDistanceList.add(distance);
            }
        }

        if (maxOrMinDistance.equals("min")) {
            Collections.sort(flightDistanceList);
            System.out.print("Min distance is: ");
        } else if (maxOrMinDistance.equals("max")) {
            Collections.sort(flightDistanceList, Collections.reverseOrder());
            System.out.print("Max distance is: ");
        }
        int distance = flightDistanceList.get(0);

        System.out.println(distance + " km");
    }

    public void findPlane(HashMap<Plane, Integer> planeBase) throws InputDataTypeException, EmptyListException {

        if (planeBase.size() == 0) {
            throw new EmptyListException("PlaneBase is empty");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose amount of passengers:");
        int inputDataPassengers = scanner.nextInt();
//        if (!scanner.hasNextInt()) { //??
//            throw new InputDataTypeException("Amount of passengers can only be an integer");
//        }

        System.out.println("Choose maximum flight altitude:");
        int inputDataAltitude = scanner.nextInt();

        System.out.println("Choose maximum cargo mass:");
        int inputDataCargoMass = scanner.nextInt();

        System.out.println("Choose maximum takeoff mass:");
        int inputDataTakeOffMass = scanner.nextInt();

        System.out.println("You can fly with: ");

        int count = 0;
            for (Plane key : planeBase.keySet()) {
                if (!planeBase.get(key).equals(0)) {
                    if (inputDataPassengers <= key.getMaxPlacesInTheSalon()
                            && inputDataAltitude <= key.getMaxFlightAltitude()
                            && inputDataCargoMass <= key.getMaxCargoMass()
                            && inputDataTakeOffMass <= key.getMaxTakeoffMass()) {
                        System.out.println(key.getName());
                        System.out.println("Max places is " + key.getMaxPlacesInTheSalon());
                        System.out.println("Max altitude is " + key.getMaxFlightAltitude());
                        System.out.println("Max cargo mass " + key.getMaxCargoMass());
                        System.out.println("Max takeoff mass " + key.getMaxTakeoffMass());
                        System.out.println("-----");
                        count++;
                    }
                }
            }
        if (count == 0) {
            System.out.println("Oops.. The airline does not have an aircraft that meets your requirements");
        }
    }

    public void totalPlasesCapacity(HashMap<Plane, Integer> planeBase) {
        int totalCapacity = 0;
        for (Plane key : planeBase.keySet()) {
            if (!planeBase.get(key).equals(0)) {
                int capacity = key.getMaxPlacesInTheSalon() * planeBase.get(key);
                totalCapacity = totalCapacity + capacity;
            }
        }
        System.out.println("Total capacity for all planes is " + totalCapacity + " places");
    }


    public void totalLiftingCapacity(HashMap<Plane, Integer> planeBase) {
        int totalCapacity = 0;
        for (Plane key : planeBase.keySet()) {
            if (!planeBase.get(key).equals(0)) {
                int capacity = key.getMaxTakeoffMass() * planeBase.get(key);
                totalCapacity = totalCapacity + capacity;
            }
        }
        System.out.println("Total lifting capacity for all planes is " + totalCapacity + " kg");
    }
}
