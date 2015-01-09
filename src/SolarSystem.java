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

    public void printPlanetNamesSortedByID() {
        System.out.println("Unsorted planets:");

        for (Planet planet : this.planets) {
            System.out.println("* " + planet.name);
        }

        // preserve original unsorted list by cloning before sorting
        Planet[] planets = this.planets.clone();

        System.out.println("\nSorted planets:");

        Collections.sort(Arrays.asList(planets), new Comparator<Planet>() {
            public int compare(Planet p1, Planet p2) {
                if (p1.orbitID > p2.orbitID) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        for (Planet planet : planets) {
            System.out.println("* " + planet.name);
        }
    }
}
