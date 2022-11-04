package section12.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        // adding planets
        HeavenlyBody tempPlanet = new HeavenlyBody("Mercury", 88);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new HeavenlyBody("Earth", 365);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new HeavenlyBody("Mars", 687);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        // adding moons
        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.get("Earth").addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.get("Mars").addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.get("Mars").addMoon(tempMoon);

        // printing all planets
        System.out.println("\nAll Planets:");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        // printing moons of specific planet
        tempPlanet = solarSystem.get("Mars");
        System.out.println("\nMoons of " + tempPlanet.getName() + ":");
        for (HeavenlyBody marsMoon : tempPlanet.getSatellites()) {
            System.out.println("\t" + marsMoon.getName());
        }

        // creating set of all moons
        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
//            for (HeavenlyBody moon : planet.getSatellites()) {
//                moons.add(moon);
//            }
            moons.addAll(planet.getSatellites());
        }

        // printing all moons
        System.out.println("\nAll Moons:");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }
    }
}
