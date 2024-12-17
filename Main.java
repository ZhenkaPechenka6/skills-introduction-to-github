import abstr.*;
import characters.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Variables variables = new Variables(3, 1, 3, 3); //это записи//
        int a = variables.minutes();
        double b = variables.efficiencyRag();
        double c = variables.liters();
        double d = variables.efficiencyTShirt();
        System.out.println("Поприветствуем наших героев:");
        for (Names allColors : Names.values()) {
            System.out.println(allColors);
        }
        System.out.println("Давайте же начнем игру!");
        Baby baby = new Baby("Малыш");
        Rag rag = new Rag(3, 1, "Ледяные руки", 100000);
        Mama mama = new Mama("Мама", a);
        TShirt tShirt = new TShirt(d, 3, "Грязь", 0);
        Actions actions = new Actions();
        actions.usingRag(a, c, rag.getEfficiency(), rag.getTime());
        //if (checking.isMin && checking.isLit) {
            System.out.println("Карлсон разлил " + c + " литров воды и улетел");
            //После этого нужно ввести штуку для определения наиболее эффективного метода

            actions.usingTShirt(a, c, tShirt.getEfficiency(), tShirt.getTime(), tShirt.getVolume());
            try {
                tShirt.haveTShirt();
            }
            catch (Checking e){
                System.out.println(e.getMessage());
            }

            if (actions.getSol1() < actions.getSol2()) {
                baby.say(a);
                rag.spendTime();
                mama.speedRun(); //Шанс уменьшения времени
                a = mama.getMinutes() - rag.getTime(); //обновили кол-во времени
                while (a > 0) {
                    c = c - b;
                    a = a - 1;
                    rag.haveEffect();
                    c = rag.getSpeed();
                }
            } else {
                System.out.println("Малыш начал вытирать пол футболкой. Вместимый объем футболки равен " + tShirt.getVolume());
                mama.speedRun(); //Шанс уменьшения времени
                a = mama.getMinutes() - tShirt.getTime(); //обновили кол-во времени
                while (a > 0) {
                    c = c - b;
                    a = a - 1;
                    rag.haveEffect();
                    c = rag.getSpeed();
                    tShirt.haveEffect(); //эффект футболки надо будет в иф сунуть
                }
                tShirt.dirty();
            }
            if (tShirt.getChance() == 0) {
                if (c == 0) {
                    System.out.println("Малыш еле-еле успел до прихода Мамы, но он цел. Победа!");
                }
                if (c < 0) {
                    System.out.println("Малыш успел помыть пол, и у него даже осталось время. Пусть пойдет есть варенье. Победа!");
                }
                if (c > 0) {
                    System.out.println("Малыш не успел. Мама убила его. Проигрыш!");
                }
            } else {
                if (c == 0) {
                    System.out.print("Малыш еле-еле успел убраться до прихода Мамы. Однако он грязный. Мама его наругала. Победа это или поражение..?");
                }
                if (c < 0) {
                    System.out.println("Малыш успел помыть пол, и у него даже осталось время сменить футболку. Победа!");
                }
                if (c > 0) {
                    System.out.println("Малыш не успел вымыть пол, так еще и остался грязным. Мама уничтожила его. Тотальное поражение!");


                }
            }


        }
    }


