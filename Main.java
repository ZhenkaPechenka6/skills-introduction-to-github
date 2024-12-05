import abstr.Actions;
import abstr.Variables;
import characters.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Variables variables = new Variables(5, 2, 3, 2); //это записи//
        int a = variables.minutes();
        double b = variables.efficiencyRag();
        double c = variables.liters();
        double d = variables.efficiencyTShirt();
        Karlson karlson = new Karlson(c);
        Baby baby = new Baby("Малыш");
        Rag rag = new Rag(b, 1, "Ледяные руки", 100000);
        Mama mama = new Mama("Мама", a);
        TShirt tShirt = new TShirt(d, 0, "Грязь", 4);
        Actions actions = new Actions();
        karlson.fly(); //Всякая писанина 2 строчки//
        mama.say();
        //После этого нужно ввести штуку для определения наиболее эффективного метода
        actions.usingRag(a, c, rag.efficiency, rag.time);
        actions.usingTShirt(a, c, tShirt.efficiency, tShirt.time, tShirt.volume);

        if (actions.sol1 < actions.sol2) {
            rag.spendtime();
            mama.speedrun(a); //Шанс уменьшения времени
            a = mama.minutes - rag.time; //обновили кол-во времени
            while (a > 0) {
                c = c - b;
                a = a - 1;
                rag.haveeffect();
                c = rag.speed;
            }
        } else {
            tShirt.spendtime();
            mama.speedrun(a); //Шанс уменьшения времени
            a = mama.minutes - tShirt.time; //обновили кол-во времени
            while (a > 0) {
                c = c - b;
                a = a - 1;
                rag.haveeffect();
                c = rag.speed;
                tShirt.haveeffect(); //эффект футболки надо будет в иф сунуть
            }
            tShirt.dirty();
        }
        if (tShirt.chance == 0) {
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
