package DecoratorDesignPattern;

public class Cappucino implements Coffee{
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Cappucino";
    }
}
