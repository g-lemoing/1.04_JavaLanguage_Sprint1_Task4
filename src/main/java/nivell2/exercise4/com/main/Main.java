package nivell2.exercise4.com.main;

import nivell2.exercise4.com.modules.Bicycle;
import nivell2.exercise4.com.modules.Car;
import nivell2.exercise4.com.modules.Lorry;
import nivell2.exercise4.com.modules.Vehicle;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        vehicle.addVehicle(new Car("Suv"));
        vehicle.addVehicle(new Bicycle("Btt"));
        vehicle.addVehicle(new Lorry("Trailer"));
        System.out.println(vehicle.getVehicle());
    }
}
