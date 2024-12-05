package characters;

public class Karlson {
    double liters;

    public void fly() {
        System.out.println("Карлсон разлил " + liters + " литров воды и улетел");
    }

    public Karlson(double liters) {
        this.liters = liters;
    }
}
