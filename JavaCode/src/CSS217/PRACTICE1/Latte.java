package CSS217.PRACTICE1;

class Latte implements Coffee {

    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public double getCost() {
        return 1450;
    }
}