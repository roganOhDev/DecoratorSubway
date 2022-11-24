package org.example.condiment.Cheese;

import org.example.condiment.CondimentDecorator;
import org.example.sandwich.Sandwich;

public class American extends CondimentDecorator {
    public American(final Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + "아메리칸 치즈 추가  ";
    }

    @Override
    public int cost() {
        return sandwich.cost() + 100;
    }
}
