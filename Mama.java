package characters;

import abstr.Moves;
import abstr.Person;

public class Mama extends Person implements Moves {
    private String name;
    public int minutes;

    public Mama(String name, int minutes) {
        super(name);
        this.minutes = minutes;
    }

    public void say() {
        System.out.println("Мама возвращается из бюро путешествий. Она очень злая из-за наводнения и исчезнувшей бегонии.");
    }

    public void speedrun(int x) {
        if (Math.random() <= 0.2) {

            System.out.println("Мама заметила по пути разбитое окно ее квартиры, она ускорилась в два раза.");
            minutes = minutes / 2 + 1;

        }
    }
}
