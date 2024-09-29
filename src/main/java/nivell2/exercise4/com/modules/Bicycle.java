package nivell2.exercise4.com.modules;

import java.util.Objects;

public class Bicycle {
    private final String name;

    public Bicycle(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "name = '" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Bicycle bicycle = (Bicycle) object;
        return Objects.equals(name, bicycle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
