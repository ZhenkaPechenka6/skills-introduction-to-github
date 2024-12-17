package characters;

import abstr.Characteristics;
import abstr.ZeroException;

public class Rag extends Characteristics {
    private int k = 0;
    private int time;
    private double efficiency;
    private String effect;
    private double speed;
    private double volume;

    public Rag(double efficiency, int time, String effect, double volume) {
        super(efficiency,time,effect,volume);
        setTime(time);
        this.effect = effect;
        setEfficiency(efficiency);
        setVolume(volume);
    }

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public void setTime(int time) throws ZeroException {
        if (time<=0) {
            throw new ZeroException("Время отрицательное. Вселенная схлопнулась!");
        }
        this.time = time;}

    @Override
    public double getEfficiency() {
        return efficiency;
    }
    public void setEfficiency(double efficiency) throws ZeroException {
        if (efficiency<=0.0) {
            throw new ZeroException("Эффективность отрицательная. Вселенная схлопнулась!");
        }
        this.efficiency = efficiency;}

    @Override
    public String getEffect() {
        return effect;
    }

    @Override
    public void setEffect(String effect) {
        this.effect = effect;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) throws ZeroException {
        if (volume<=0.0) {
            throw new ZeroException("Объем отрицательный. Вселенная схлопнулась!");
        }
        this.volume = volume;}


    public void spendTime() {
        if (time == 1) {
            System.out.println("Малыш побежал за тряпкой. Он потратил на это " + time + " минуту");
        }
        if (time > 4) {
            System.out.println("Малыш побежал за тряпкой. Он потратил на это " + time + " минут");
        }
        if (1 < time && time < 5) {
            System.out.println("Малыш побежал за тряпкой. Он потратил на это " + time + " минуты");
        }
    }

    @Override
    public void haveEffect() {
        speed = efficiency * 0.9 - efficiency * k * 0.1;
        k += 1;
        System.out.println("Тряпка очень холодная. Малыш получил эффект " + effect + ". Эффективность с каждым разом снижается на 10%. Теперь она " + speed);
    }
    @Override
    public String toString() {
        return String.format("Эффективность тряпки %s", efficiency);
    }

    @Override
    public int hashCode() {
        return time * 14 + effect.hashCode() * 7;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Rag rag)) {
            return false;
        }
        return time == rag.getTime()
                && (effect != null && effect.equals(getEffect())) && (time == rag.getTime());
    }
}



