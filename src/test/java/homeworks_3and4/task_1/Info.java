package homeworks_3and4.task_1;

import homeworks_3and4.task_1.airlines.AirlineAlliance;
import homeworks_3and4.task_1.airlines.Airlines;
import homeworks_3and4.task_1.airlines.AirlinesNames;
import homeworks_3and4.task_1.modeOfTransport.Plane;

import java.util.*;

public class Info {
    public static void main(String[] args) {

        Airlines klm = new Airlines(AirlinesNames.KLM, 145);
        klm.setActivity(true);
        klm.setYearOfFoundation(1919);
        klm.setHeadquarters("Amstelveen, Netherlands");
        klm.setAirlineAlliance(AirlineAlliance.SKY_TEAM);
        klm.setKeyPeople("Pieter Elbers");
        klm.setEmployees(35410);
        HashMap<Plane, Integer> klmPlanes = klm.planesBase(5,10,1,
                2,0,4,0,1, 0, 0);
        klmPlanes.size();


        System.out.println("----");


        System.out.println("----");
    }


    private int chooseAirlines() {
        System.out.println("Choose the airlines:");
        System.out.println("1 - American airlines,2 - Lufthansa,3 - Air Malta, 4 - Air France, 5 - AlItalia, 6 - KLM");
        Scanner scanner = new Scanner(System.in);
        int airlines = scanner.nextInt();
        return airlines;
    }

//    public int countOfPassengers(Object aircraft) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Choose the Type of aircraft:");
//        System.out.println("1 - Plane, 2 - Helicopter, 3 - Multicopter, 4 - Airship, 5 - GasBallon");
//        System.out.println();
//        int input = scanner.nextInt();
//
//        switch (input) {
//            case 1:
//                System.out.println("Choose the plane type:");
//                System.out.println("1 - Airbus, 2 - Boeing");
//                System.out.println();
//                input = scanner.nextInt();
//
//                if (input == 1) {
//                    System.out.println("Choose the Airbus model:");
//                    System.out.println("1 - A220, 2 - A320, 3 - A321, 4 - A330, 5 - A350, 6 - A380");
//                    System.out.println();
//                    input = scanner.nextInt();
//                    switch (input) {
//
//                    }
//                } else {
//                    System.out.println("Choose the Boeing model:");
//                }
//                break;
//
//        }
//
//
//        int countOfPassengers = 0;
//        return countOfPassengers;
//    }


}
