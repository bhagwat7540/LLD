package DecoratorDesignPattern;

public class ChocoChips extends Wrapper{
    public ChocoChips(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + "ChocoChip";
    }
}
