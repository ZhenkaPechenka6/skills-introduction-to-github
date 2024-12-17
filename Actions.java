package abstr;

public class Actions {
    private double sol1 = 0;
    private double sol2 = 0;

    public double getSol1() {
        return sol1;
    }

    public void setSol1(double sol1) {
        this.sol1 = sol1;
    }

    public double getSol2() {
        return sol2;
    }

    public void setSol2(double sol2) {
        this.sol2 = sol2;
    }

    public void usingRag (int minutes, double liters, double ragEff, int ragTime){

        minutes = minutes - ragTime;
        while (minutes > 0) {
            liters = liters - ragEff;
            minutes = minutes - 1;

        }
        sol1 = liters;
    }

    public void usingTShirt(int minutes, double liters, double tsEff, int tsTime, double tsVolume) {
        minutes = minutes - tsTime;
        if (tsVolume < liters) {
            sol2 = 1000000;
            return;
        }
        while (minutes > 0) {
            liters = liters - tsEff;
            minutes = minutes - 1;
        }
        sol2 = liters;
    }
}
