package nivell2.exercise4.com.modules;

import java.util.Objects;

public class Car {
    private final String name;

    public Car(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name: '" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
