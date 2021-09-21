import vehicle.Boat;
import vehicle.Car;

public class Hangar {

    public static void main(String[] args) {
        Car opel = new Car("Opel", 15000);
        Car audi = new Car("Audi", 40000);
        Boat titanic = new Boat("Titanic", 30000);
        Boat santaMaria = new Boat("Santa Maria", 20000);

        System.out.println(opel.doStuff());
        System.out.println(titanic.doStuff());
        System.out.println(audi.doStuff());
        System.out.println(santaMaria.doStuff());
    }
}
