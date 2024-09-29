package nivell2.exercise4.com.modules;

import java.util.Objects;

public class Lorry {
    private final String name;
    public Lorry(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "name = '" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Lorry lorry = (Lorry) object;
        return Objects.equals(name, lorry.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
