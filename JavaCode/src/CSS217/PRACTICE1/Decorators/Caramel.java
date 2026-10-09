package CSS217.PRACTICE1.Decorators;

import CSS217.PRACTICE1.Coffee;

public class Caramel extends CoffeeDecorator {

    public Caramel(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Caramel";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 200;
    }
}