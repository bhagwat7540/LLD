package DecoratorDesignPattern;

public abstract class Wrapper implements Coffee{
    public Coffee coffee;

    public Wrapper(Coffee coffee) {
        this.coffee = coffee;
    }
}
