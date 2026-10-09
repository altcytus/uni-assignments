package CSS217.PRACTICE1;

import CSS217.PRACTICE1.Decorators.Caramel;
import CSS217.PRACTICE1.Decorators.Cinnamon;
import CSS217.PRACTICE1.Decorators.Milk;
import CSS217.PRACTICE1.Decorators.Sugar;

public class MainCoffee {
    public static void main(String[] args) {
        Coffee order1 = new Espresso();
        order1 = new Milk(order1);
        order1 = new Sugar(order1);

        System.out.println(order1.getDescription());
        System.out.println("Cost: " + order1.getCost() + "tg");
        System.out.println();

        Coffee order2 = new Latte();
        order2 = new Caramel(order2);
        order2 = new Milk(order2);
        order2 = new Sugar(order2);

        System.out.println(order2.getDescription());
        System.out.println("Cost: " + order2.getCost() + "tg");
        System.out.println();

        Coffee order3 = new Americano();
        order3 = new Sugar(order3);
        order3 = new Sugar(order3);
        order3 = new Caramel(order3);
        order3 = new Cinnamon(order3);

        System.out.println(order3.getDescription());
        System.out.println("Cost: " + order3.getCost() + "tg");
    }
}