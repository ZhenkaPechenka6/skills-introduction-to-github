package abstr;

public class Actions {
    public double sol1 = 0;
    public double sol2 = 0;


    public Actions() {

    }

    public double usingRag(int minutes, double liters, double ragEff, int ragTime) {
        minutes = minutes - ragTime;
        while (minutes > 0) {
            liters = liters - ragEff;
            minutes = minutes - 1;

        }
        sol1 = liters;
        return sol1;
    }

    public double usingTShirt(int minutes, double liters, double tsEff, int tsTime, double tsVolume) {
        minutes = minutes - tsTime;
        if (tsVolume < liters) {
            sol2 = 1000000;
            return sol2;
        }
        while (minutes > 0) {
            liters = liters - tsEff;
            minutes = minutes - 1;
        }
        sol2 = liters;
        return sol2;
    }
}
