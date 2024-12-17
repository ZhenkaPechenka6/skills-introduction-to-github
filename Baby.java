package characters;

import abstr.Moves;
import abstr.Names;
import abstr.Person;

public class Baby  extends Person  implements Moves{
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Baby(String name) {
        super(name);

    }
    public void say(int x) {
        if (x >= 5) {
            System.out.println("У Малыша есть " + x + " минут до прихода Мамы");
        }
        if (x == 1) {
            System.out.println("У Малыша есть " + x + " минута до прихода Мамы");
        } else {
            System.out.println("У Малыша есть " + x + " минуты до прихода Мамы");
        }

    }
    @Override
    public String toString() {
        return String.format("Человек по имени %s", name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 7;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Baby baby)) {
            return false;
        }
        return (name != null && name.equals(getName()));
    }
}





