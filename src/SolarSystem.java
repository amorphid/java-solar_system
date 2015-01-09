import java.util.*;

public class SolarSystem {
    private ArrayList<Planet> planets;

    public SolarSystem() {
        ArrayList<Planet> planets = new ArrayList<Planet>();
        planets.add(new Planet("Mercury", 1));
        planets.add(new Planet("Venus", 2));
        planets.add(new Planet("Earth", 3));
        planets.add(new Planet("Mars", 4));
        planets.add(new Planet("Jupiter", 5));
        planets.add(new Planet("Saturn", 6));
        planets.add(new Planet("Uranus", 7));
        planets.add(new Planet("Neptune", 8));

        Collections.shuffle(planets);

        this.planets = planets;
    }

    public void printPlanetNames() {
        System.out.println("Unsorted planets:");

        for (Planet planet : this.planets) {
            System.out.println("* " + planet.name);
        }
    }

    public void printPlanetNamesSortedById() {
        System.out.println("Sorted planets:");

        for (Planet planet : this.sortPlanetsById()) {
            System.out.println("* " + planet.name);
        }
    }

    public ArrayList<Planet> sortPlanetsById() {
        // preserve original unsorted list by cloning it before sorting
        ArrayList<Planet> planetsClone = new ArrayList<Planet>(this.planets);

        planetsClone.sort(new Comparator<Planet>() {
            public int compare(Planet p1, Planet p2) {
                if (p1.orbitID > p2.orbitID) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        return planetsClone;
    }
}
