package abstr;

public abstract class Person {
    private final String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }
}
