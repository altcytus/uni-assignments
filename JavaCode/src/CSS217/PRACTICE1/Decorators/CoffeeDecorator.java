package CSS217.PRACTICE1.Decorators;

import CSS217.PRACTICE1.Coffee;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
