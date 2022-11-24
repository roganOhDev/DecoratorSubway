package org.example.condiment.Souce;

import org.example.condiment.CondimentDecorator;
import org.example.sandwich.Sandwich;

public class Sault extends CondimentDecorator {
    public Sault(final Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + "소금 추가  ";
    }

    @Override
    public int cost() {
        return sandwich.cost() + 20;
    }
}
