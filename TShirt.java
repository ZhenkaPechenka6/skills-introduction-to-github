package characters;

import abstr.Characteristics;
import abstr.Checking;
import abstr.ZeroException;

public class TShirt extends Characteristics {

    int k = 0;
    private int chance = 0;
    private final String effect;
    private int time;
    private double efficiency;

    public TShirt(double efficiency, int time, String effect, double volume) {
        super(efficiency, time, effect, volume);
        this.effect = effect;
        setEfficiency(efficiency);
        setTime(time);

    }

    @Override
    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) throws ZeroException {
        if (efficiency <= 0.0) {
            throw new ZeroException("Эффективность отрицательная. Вселенная схлопнулась!");
        }
        else {
            this.efficiency = efficiency;
        }
    }


    public void setTime(int time) throws ZeroException {
        if (time <= 0) {
            throw new ZeroException("Время отрицательное. Вселенная схлопнулась!");
        }
        this.time = time;
    }

    @Override
    public int getTime() {
        return time;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    @Override
    public String getEffect() {
        return effect;
    }



    @Override
    public void haveEffect() {
        if (k == 0) {
            System.out.println("Малыш наложил на себя эффект - " + effect + ". Чем чаще он вытирает пол футболкой, тем грязнее становится. ");
        }
        k += 1;
    }

    public void dirty() {
        if (Math.random() <= 0.2 * k) {
            System.out.println("Малыш стал очень грязным! Он сильно разозлит Маму, если не успеет переодеться.");
            chance = 1;

        }
    }
    public void haveTShirt() throws Checking {
        if (volume<=0.0){
            throw new Checking("Сегодня жаркий день. Малыш без футболки. Придется использовать тряпку");

        }

    }
    @Override
    public String toString() {
        return String.format(effect);
    }

    @Override
    public int hashCode() {
        return time * 14 + effect.hashCode() * 7 + effect.hashCode() - 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TShirt tShirt)) {
            return false;
        }
        return efficiency == tShirt.getEfficiency()
                && (effect != null && effect.equals(getEffect())) && (time == tShirt.getTime());
    }
}

