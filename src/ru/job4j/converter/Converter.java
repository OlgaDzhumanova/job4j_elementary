package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(400);
        System.out.println("400 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(400);
        System.out.println("400 rubles are " + dollar + " dollar.");
    }
}

