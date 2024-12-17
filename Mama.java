package characters;

import abstr.Person;
import abstr.ZeroException;

public class Mama extends Person  {
    private int minutes;
    private String name;

    public Mama(String name, int minutes) {
        super(name);
        this.name=name;
        setMinutes(minutes);
    }
    public void speedRun() {
        if (Math.random() <= 0.2) {

            System.out.println("Мама заметила по пути разбитое окно ее квартиры, она ускорилась в два раза.");
            minutes = minutes / 2 + 1;

        }
    }

    public void setMinutes(int minutes) throws ZeroException {
        if (minutes<0) {
            throw new ZeroException("Время отрицательное. Вселенная схлопнулась!");
        }
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }
    @Override
    public String toString() {
        return String.format("Человек по имени %s", name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 7 + name.hashCode() - 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Mama mama)) {
            return false;
        }
        return (name != null && name.equals(getName())) && (minutes == mama.getMinutes());
    }
}
