package HW22_new;

import java.util.Arrays;

public class Autosalon {
    String[] salon;

    public Autosalon(String[] salon) {
        this.salon = salon;
    }

    public void findCar(String carToFind) {

        for (String car : salon) {
           if (car.equals(carToFind)) {
             System.out.println("This car is available.");

             return;
           }
        }

        System.out.print("This car is not available, please choose from: " + Arrays.toString(salon));
    }

}
