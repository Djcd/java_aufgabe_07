package vehicle;

import vehicle.Vehicle;

public class Car extends Vehicle {

    @Override
    public String doStuff() {
        return  "I am "+this.getBrand()+" and I go zoom zoom zoom!";
    }

    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }
}
