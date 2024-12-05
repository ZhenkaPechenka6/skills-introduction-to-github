package abstr;

public abstract class Characteristics {
    double efficiency;
    int time;
    String effect;
    double volume;

    public Characteristics(double efficiency, int time, String effect, double volume) {
        this.efficiency = efficiency;
        this.effect = effect;
        this.time = time;
        this.volume = volume;
    }

    public abstract void spendtime();

    public abstract void haveeffect();
}
