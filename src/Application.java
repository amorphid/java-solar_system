public class Application {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        solarSystem.printPlanetNames();
        System.out.println();
        solarSystem.printPlanetNamesSortedById();
    }
}