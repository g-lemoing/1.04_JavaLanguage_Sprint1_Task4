package nivell2.exercise4.com.modules;

import java.util.ArrayList;
import java.util.Objects;

public class Vehicle {
    private final ArrayList<Object> contVehicle = new ArrayList<>();

    public Vehicle(){
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Vehicle vehicle = (Vehicle) object;
        return Objects.equals(contVehicle, vehicle.contVehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(contVehicle);
    }

    public void addVehicle(Object object){
        contVehicle.add(object);
    }
    public ArrayList<Object> getVehicle(){
        return contVehicle;
    }
}
