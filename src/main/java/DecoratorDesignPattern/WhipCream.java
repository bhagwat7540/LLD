package DecoratorDesignPattern;

public class WhipCream extends Wrapper{
    public WhipCream(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + "WhipCream";
    }
}
