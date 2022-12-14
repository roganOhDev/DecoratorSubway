package org.example;


import org.example.condiment.Cheese.American;
import org.example.condiment.Cheese.Shred;
import org.example.condiment.Souce.Sault;
import org.example.condiment.Souce.Sugar;
import org.example.condiment.Vegetable.Lettuce;
import org.example.condiment.Vegetable.Tomato;
import org.example.sandwich.EggSandwich;
import org.example.sandwich.MeatSandwich;
import org.example.sandwich.Sandwich;
import org.example.sandwich.SandwichType;

public class Main {
    public static void main(String[] args) {
        showMenus();

        order(SandwichType.MEAT);
        order(SandwichType.EGG);
    }

    private static void showMenus() {
        System.out.println("--------------------------------------------");
        System.out.println("에그 샌드위치 : 4000원");
        System.out.println("고기 샌드위치 : 5000원\n\n");

        System.out.println("양상추 추가 : 300원");
        System.out.println("토마토 추가 : 500원\n\n");

        System.out.println("아메리칸 치즈 추가 : 100원");
        System.out.println("슈레드 치즈 추가 : 200원\n\n");

        System.out.println("소금 소스 추가 : 20원");
        System.out.println("설탕 소스 추가 : 10원");
        System.out.println("--------------------------------------------");
    }

    private static void order(final SandwichType type) {
        var sandwich = chooseSandwich(type);

        sandwich = addLettuce(sandwich);
        sandwich = addAmericanCheese(sandwich);
        sandwich = addSault(sandwich);

        System.out.println(sandwich.getDescription() + " : " + sandwich.cost() + "원");
    }

    private static Sandwich addLettuce(Sandwich sandwich) {
        return new Lettuce(sandwich);
    }

    private static Sandwich addTomato(Sandwich sandwich) {
        return new Tomato(sandwich);
    }

    private static Sandwich addSault(Sandwich sandwich) {
        return new Sault(sandwich);
    }

    private static Sandwich addSugar(Sandwich sandwich) {
        return new Sugar(sandwich);
    }

    private static Sandwich addAmericanCheese(Sandwich sandwich) {
        return new American(sandwich);
    }

    private static Sandwich addShredCheese(Sandwich sandwich) {
        return new Shred(sandwich);
    }

    private static Sandwich chooseSandwich(final SandwichType type) {
        switch (type) {
            case EGG:
                return new EggSandwich();

            case MEAT:
                return new MeatSandwich();
        }

        throw new RuntimeException("error");
    }
}
