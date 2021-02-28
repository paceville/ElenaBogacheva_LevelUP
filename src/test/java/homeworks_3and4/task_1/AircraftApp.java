package homeworks_3and4.task_1;

import homeworks_3and4.task_1.airlines.AirlineAlliance;
import homeworks_3and4.task_1.airlines.Airlines;
import homeworks_3and4.task_1.airlines.AirlinesNames;
import homeworks_3and4.task_1.modeOfTransport.Aircraft;
import homeworks_3and4.task_1.modeOfTransport.Plane;
import homeworks_3and4.task_1.modeOfTransport.PlaneType;

import java.util.HashMap;

public class AircraftApp {
    public static void main(String[] args) {

        Plane a321 = new Plane(PlaneType.A321, 17000);
        a321.setName("Airbus A321");
        a321.setMaxPlacesInTheSalon(240);
        a321.setMaxCargoMass(21);
        a321.setMaxTakeoffMass(260000);
        a321.setMaxFlightAltitude(12000);
        a321.capacity();
        a321.flightAltitude();

        Airlines klm = new Airlines(AirlinesNames.KLM, 145);
        klm.setActivity(true);
        klm.setYearOfFoundation(1919);
        klm.setHeadquarters("Amstelveen, Netherlands");
        klm.setAirlineAlliance(AirlineAlliance.SKY_TEAM);
        klm.setKeyPeople("Pieter Elbers");
        klm.setEmployees(35410);
        HashMap<Plane, Integer> klmPlanes = klm.planesBase(2,0,0,
                0,0,0,0,1, 0, 0);
        HashMap<Aircraft, Integer> klmAircrafts = klm.aircraftsBase(klmPlanes, 0,1, 3, 2,
                0, 12, 5, 0);
        klm.flightDistance(klmAircrafts);
        klm.findPlane(klmPlanes);
        klm.totalPlasesCapacity(klmPlanes);
        klm.totalLiftingCapacity(klmPlanes);

        Airlines lufthansa = new Airlines(AirlinesNames.LUFTHANSA, 220);
        lufthansa.setActivity(true);
        lufthansa.setYearOfFoundation(1926);
        lufthansa.setHeadquarters("Cologne, Germany");
        lufthansa.setAirlineAlliance(AirlineAlliance.STAR_ALLIANCE);
        lufthansa.setParentCompany("Lufthansa Group");
        lufthansa.setKeyPeople("Carsten Spohr");
        lufthansa.setEmployees(138353);
        HashMap<Plane, Integer> lufthansaPlanes = lufthansa.planesBase(3,15,8,
                4,5,12,2,7, 0, 4);
        HashMap<Aircraft, Integer> lufthansaAircrafts = lufthansa.aircraftsBase(lufthansaPlanes, 0,1, 3, 2,
                0, 12, 5, 0);
        lufthansa.flightDistance(lufthansaAircrafts);
        lufthansa.findPlane(lufthansaPlanes);
        lufthansa.totalPlasesCapacity(lufthansaPlanes);
        lufthansa.totalLiftingCapacity(lufthansaPlanes);

        Airlines american_airlines = new Airlines(AirlinesNames.AMERICAN_AIRLINES, 350);
        american_airlines.setActivity(true);
        american_airlines.setYearOfFoundation(1926);
        american_airlines.setHeadquarters("Fort Worth, Texas, United States");
        american_airlines.setAirlineAlliance(AirlineAlliance.ONEWORLD);
        american_airlines.setParentCompany("American Airlines Group");
        american_airlines.setKeyPeople("Robert Isom");
        american_airlines.setEmployees(133700);
        HashMap<Plane, Integer> AmericanAirlinesPlanes = american_airlines.planesBase(1,7,4,
                6,12,5,22,17, 2, 9);
        HashMap<Aircraft, Integer> AmericanAirlinesAircrafts = american_airlines.aircraftsBase(AmericanAirlinesPlanes, 0,1, 3, 2,
                0, 12, 5, 0);
        american_airlines.flightDistance(AmericanAirlinesAircrafts);
        american_airlines.findPlane(AmericanAirlinesPlanes);
        american_airlines.totalPlasesCapacity(AmericanAirlinesPlanes);
        american_airlines.totalLiftingCapacity(AmericanAirlinesPlanes);

        Airlines airMalta = new Airlines(AirlinesNames.AIR_MALTA, 39);
        airMalta.setActivity(true);
        airMalta.setYearOfFoundation(1973);
        airMalta.setHeadquarters("Luqa, Malta");
        airMalta.setKeyPeople("David Curmi");
        HashMap<Plane, Integer> airMaltaPlanes = airMalta.planesBase(0,5,7,
                2,5,4,1,0, 0, 1);
        HashMap<Aircraft, Integer> airMaltaAircrafts = airMalta.aircraftsBase(airMaltaPlanes, 0,1, 3, 2,
                0, 12, 5, 0);
        airMalta.flightDistance(airMaltaAircrafts);
        airMalta.findPlane(airMaltaPlanes);
        airMalta.totalPlasesCapacity(airMaltaPlanes);
        airMalta.totalLiftingCapacity(airMaltaPlanes);


        Airlines airFrance = new Airlines(AirlinesNames.AIR_FRANCE, 211);
        airFrance.setActivity(true);
        airFrance.setYearOfFoundation(1933);
        airFrance.setHeadquarters("Paris, France");
        airFrance.setAirlineAlliance(AirlineAlliance.SKY_TEAM);
        airFrance.setParentCompany("Air France?KLM");
        airFrance.setKeyPeople("Anne Rigail");
        airFrance.setEmployees(84602);
        HashMap<Plane, Integer> airFrancePlanes = airFrance.planesBase(2,0,4,
                6,10,0,14,8, 2, 3);
        HashMap<Aircraft, Integer> airFranceAircrafts = airFrance.aircraftsBase(airFrancePlanes, 0,1, 3, 2,
                0, 12, 5, 0);
        airFrance.flightDistance(airFranceAircrafts);
        airFrance.findPlane(airFrancePlanes);
        airFrance.totalPlasesCapacity(airFrancePlanes);
        airFrance.totalLiftingCapacity(airFrancePlanes);


        Airlines alItalia = new Airlines(AirlinesNames.ALITALIA, 100);
        alItalia.setActivity(true);
        alItalia.setYearOfFoundation(1946);
        alItalia.setHeadquarters("Rome, Italy");
        alItalia.setAirlineAlliance(AirlineAlliance.SKY_TEAM);
        alItalia.setKeyPeople("Francesco Caio");
        alItalia.setEmployees(12013);
        HashMap<Plane, Integer> alItaliaPlanes = alItalia.planesBase(1,10,4,
                1,0,0,15,3, 2, 5);
        HashMap<Aircraft, Integer> alItaliaAircrafts = alItalia.aircraftsBase(alItaliaPlanes, 0,1, 3, 2,
                0, 12, 5, 0);
        alItalia.flightDistance(alItaliaAircrafts);
        alItalia.findPlane(alItaliaPlanes);
        alItalia.totalPlasesCapacity(alItaliaPlanes);
        alItalia.totalLiftingCapacity(alItaliaPlanes);

    }
}
