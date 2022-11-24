package org.example.condiment.Vegetable;

import org.example.condiment.CondimentDecorator;
import org.example.sandwich.Sandwich;

public class Lettuce extends CondimentDecorator {
    public Lettuce(final Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + "양상추 추가  ";
    }

    @Override
    public int cost() {
        return sandwich.cost() + 300;
    }
}
