package DecoratorDesignPattern;

public class Espresso implements Coffee{
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
