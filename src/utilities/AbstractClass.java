package utilities;

import java.util.Objects;


public abstract class AbstractClass {
    private String name;

    public AbstractClass(String name) {
        if ((name == null) || (name.isEmpty())) {
            throw new IllegalArgumentException("Некорректное имя ");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractClass testobj = (AbstractClass) obj;
        return name.equals(testobj.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return getClass() + "{name=" + name + "}";
    }
}
