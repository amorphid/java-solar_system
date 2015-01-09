import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SolarSystem {
    private Planet[] planets;

    public SolarSystem() {
        Planet[] planets = new Planet[] {
            new Planet("Mercury", 1),
            new Planet("Venus", 2),
            new Planet("Earth", 3),
            new Planet("Mars", 4),
            new Planet("Jupiter", 5),
            new Planet("Saturn", 6),
            new Planet("Uranus", 7),
            new Planet("Neptune", 8)
        };

        Collections.shuffle(Arrays.asList(planets));

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

        for (Planet planet : this.sortPlanets()) {
            System.out.println("* " + planet.name);
        }
    }

    public Planet[] sortPlanets() {
        // preserve original unsorted list by cloning it before sorting
        Planet[] planetsClone = this.planets.clone();

        Collections.sort(Arrays.asList(planetsClone), new Comparator<Planet>() {
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
