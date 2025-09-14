
public class Main {
    public static void main(String[] args) {

        Car cityCar = new Car.Builder(4, "V4").build();

        Car sportCar = new Car.Builder(2, "V12 Turbo")
                .withColor("Red")
                .build();


        Car blueCar = new Car.Builder(5, "V6")
                .withColor("Blue")
                .build();

        System.out.println(cityCar);
        System.out.println(sportCar);
        System.out.println(blueCar);
    }
}