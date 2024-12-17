package abstr;

public abstract class Characteristics {
    protected double efficiency;
    protected int time;
    protected String effect;
    protected double volume;

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public double getVolume() {
        return volume;
    }

    public Characteristics(double efficiency, int time, String effect, double volume) {
        this.efficiency = efficiency;
        this.effect = effect;
        this.time = time;
        this.volume = volume;
    }

    public abstract void haveEffect();
}
