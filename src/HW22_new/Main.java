package HW22_new;

public class Main {
    public static void main(String[] args) {

        String[] salonArray = {"Audi", "BMW", "Ford", "Honda", "Hyundai", "Kia", "Mazda"};
        Autosalon autosalon = new Autosalon(salonArray);

        autosalon.findCar("Honda");

    }

}
