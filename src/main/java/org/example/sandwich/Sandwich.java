package org.example.sandwich;

import lombok.ToString;

public abstract class Sandwich {
    String description = "μλμμΉ";

    public String getDescription(){
        return description;
    }

    public abstract int cost();
}
