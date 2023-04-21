package by.pvt.generics;

import java.util.Objects;

public class Garage  <C extends Vehicle, M extends Vehicle> {
    C key;
    M value;

    @Override
    public String toString() {
        return "Garage{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage<?, ?> garage = (Garage<?, ?>) o;
        return Objects.equals(key, garage.key) && Objects.equals(value, garage.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    public C getKey() {
        return key;
    }

    public void setKey(C key) {
        this.key = key;
    }

    public M getValue() {
        return value;
    }

    public void setValue(M value) {
        this.value = value;
    }

    public Garage(C key, M value) {
        this.key = key;
        this.value = value;
    }


}
