package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 90;
    }

    public static int rubleToDollar(int value) {
        return value / 75;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(180);
        int dollar = Converter.rubleToDollar(150);
        System.out.println("180 rubles are " + euro + " euro.");
        System.out.println("150 rubles are " + dollar + " dollar.");
    }
}
