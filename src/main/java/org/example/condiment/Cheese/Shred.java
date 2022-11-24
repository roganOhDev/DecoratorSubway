package org.example.condiment.Cheese;

import org.example.condiment.CondimentDecorator;
import org.example.sandwich.Sandwich;

public class Shred extends CondimentDecorator {
    public Shred(final Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + "슈레드 치즈 추가  ";
    }

    @Override
    public int cost() {
        return sandwich.cost() + 200;
    }
}
