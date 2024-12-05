package characters;

import abstr.Person;

public class Baby extends Person {
    private String name;

    public Baby(String name) {
        super(name);

    }

    public void say(int x, double y) {
        if (x >= 5) {
            System.out.println("У Малыша есть " + x + " минут до прихода Мамы");
        }
        if (x == 1) {
            System.out.println("У Малыша есть " + x + " минута до прихода Мамы");
        } else {
            System.out.println("У Малыша есть " + x + " минуты до прихода Мамы");
        }
        System.out.println("Он берет тряпку эффективностью " + y + " и начинает натирать пол.");

    }


}


