package DecoratorDesignPattern;

import java.io.BufferedInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        Coffee cappucino = new Cappucino();
        cappucino = new WhipCream(cappucino);
        cappucino = new ChocoChips(cappucino);

        System.out.println(cappucino.getCost());
        System.out.println(cappucino.getDescription());

        Coffee espresso = new Espresso();
        espresso = new ChocoChips(espresso);
        System.out.println(espresso.getCost());
        System.out.println(espresso.getDescription());

    }
}
