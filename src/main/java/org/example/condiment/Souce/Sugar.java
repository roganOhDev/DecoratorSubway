package org.example.condiment.Souce;

import org.example.condiment.CondimentDecorator;
import org.example.sandwich.Sandwich;

public class Sugar extends CondimentDecorator {
    public Sugar(final Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + "설탕 추가  ";
    }

    @Override
    public int cost() {
        return sandwich.cost() + 10;
    }
}
