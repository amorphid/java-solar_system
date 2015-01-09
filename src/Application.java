public class Application {
    public static void main(String[] args) {
        Planet[] solarSystem = {
                new Planet("Mercury"),
                new Planet("Venus"),
                new Planet("Earth"),
                new Planet("Mars"),
                new Planet("Jupiter"),
                new Planet("Saturn"),
                new Planet("Uranus"),
                new Planet("Neptune")
        };

        for (Planet planet : solarSystem) {
            System.out.println(planet.getName());
        }
    }
}
