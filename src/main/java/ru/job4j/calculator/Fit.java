package ru.job4j.calculator;

public class Fit {

    private static final double COEFFICIENT = 1.15;
    private static final int MALE_OFFSET = 100;
    private static final int FEMALE_OFFSET = 110;

    public static double idealWeight(int height, boolean isMale) {
        int offset = isMale ? MALE_OFFSET : FEMALE_OFFSET;
        return (height - offset) * COEFFICIENT;
    }

    public static void main(String[] args) {
        int heightMan = 187;
        int heightWoman = 170;

        double man = Fit.idealWeight(heightMan, true);
        double woman = Fit.idealWeight(heightWoman, false);

        System.out.println("Man " + heightMan + " cm -> " + String.format("%.2f", man) + " kg");
        System.out.println("Woman " + heightWoman + " cm -> " + String.format("%.2f", woman) + " kg");
    }

}
