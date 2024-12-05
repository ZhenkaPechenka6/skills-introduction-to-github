package characters;

import abstr.Characteristics;

public class Rag extends Characteristics {
    int k = 0;
    public int time;
    public double efficiency;
    public String effect;
    public double speed;
    public double volume;

    public Rag(double efficiency, int time, String effect, double volume) {
        super(efficiency, time, effect, volume);
        this.time = time;
        this.effect = effect;
        this.efficiency = efficiency;
        this.volume = volume;
    }

    @Override
    public void spendtime() {
        if (time == 1) {
            System.out.println("Малыш побежал за тряпкой. Он потратил на это " + time + " минуту");
        }
        if (time > 4) {
            System.out.println("Малыш побежал за тряпкой. Он потратил на это " + time + " минут");
        }
        if (1<time && time<5){
            System.out.println("Малыш побежал за тряпкой. Он потратил на это " + time + " минуты");
        }
    }

    @Override
    public void haveeffect() {

        speed = efficiency * 0.9 - efficiency * k * 0.1;
        k += 1;


        System.out.println("Тряпка очень холодная. Малыш получил эффект " + effect + ". Эффективность с каждым разом снижается на 10%. Теперь она " + speed);


    }
}
