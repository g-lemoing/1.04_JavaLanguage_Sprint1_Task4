package nivell2.exercise4.com.modules;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Lists.newArrayList;

public class VehicleTest {
    @DisplayName("Comprovar llista conté els elements de la llista referència en l'ordre d'inserció.")
    @Test
    public void checkContainsElementsInOrder() {
        Vehicle vehicle = new Vehicle();
        Car car = new Car("Suv");
        Lorry lorry = new Lorry("Trailer");
        Bicycle bicycle = new Bicycle("Btt");
        vehicle.addVehicle(car);
        vehicle.addVehicle(lorry);
        vehicle.addVehicle(bicycle);
        assertThat(vehicle.getVehicle()).containsExactlyElementsOf(newArrayList(car, lorry, bicycle));
    }

    @DisplayName("Comprovar llista conté els elements de la llista referència")
    @Test
    public void checkContainsElements(){
        Vehicle vehicle = new Vehicle();
        Car car = new Car("Suv");
        Lorry lorry = new Lorry("Trailer");
        Bicycle bicycle = new Bicycle("Btt");
        vehicle.addVehicle(car);
        vehicle.addVehicle(lorry);
        vehicle.addVehicle(bicycle);
        assertThat(vehicle.getVehicle()).containsExactlyInAnyOrderElementsOf(newArrayList(car, bicycle, lorry));
    }

    @DisplayName("Comprovar que un element s'ha afegit només una vegada en la llista.")
    @Test
    public void checkDuplicates(){
        Vehicle vehicle = new Vehicle();
        vehicle.addVehicle(new Car("Suv"));
        vehicle.addVehicle(new Bicycle("Btt"));
        vehicle.addVehicle(new Lorry("Trailer"));
        assertThat(vehicle.getVehicle()).containsOnlyOnce(new Car("Suv"));
    }

    @DisplayName("Comprovar que un element no s'ha afegit a la llista.")
    @Test
    public void checkNotExists(){
        Vehicle vehicle = new Vehicle();
        vehicle.addVehicle(new Car("Suv"));
        vehicle.addVehicle(new Bicycle("Btt"));
        assertThat(vehicle.getVehicle()).doesNotContain(new Lorry("Trailer"));
    }
}