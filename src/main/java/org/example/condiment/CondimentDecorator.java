package org.example.condiment;

import org.example.sandwich.Sandwich;

public abstract class CondimentDecorator extends Sandwich {
    protected Sandwich sandwich;

    @Override
    public abstract String getDescription();
}
