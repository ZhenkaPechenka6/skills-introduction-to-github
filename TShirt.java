package characters;

import abstr.Characteristics;

public class TShirt extends Characteristics {

    int k = 0;
    public int chance = 0;
    public int time;
    public double efficiency;
    public String effect;
    public double volume;

    public TShirt(double efficiency, int time, String effect, double volume) {
        super(efficiency, time, effect, volume);
        this.time = time;
        this.effect = effect;
        this.efficiency = efficiency;
        this.volume = volume;
    }

    @Override
    public void spendtime() {
        System.out.println("Малыш начал вытирать пол ногами. Вместимый объем футболки равен " + volume);
    }

    @Override
    public void haveeffect() {
        if (k==0){
        System.out.println("Малыш наложил на себя эффект - " + effect + ". Чем чаще он вытирает пол футболкой, тем грязнее становится. ");}
        k += 1;
    }

    public void dirty() {
        if (Math.random() <= 0.2 * k) {
            System.out.println("Малыш стал очень грязным! Он сильно разозлит Маму, если не успеет переодеться.");
            chance = 1;

        }
    }

}
