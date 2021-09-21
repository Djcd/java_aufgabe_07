package vehicle;

import vehicle.Vehicle;

public class Boat extends Vehicle {

    @Override
    public String doStuff() {
        return  "I am "+this.getBrand()+" and I go glug glug!";
    }

    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }
}
