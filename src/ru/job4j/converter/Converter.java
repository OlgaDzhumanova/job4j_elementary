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

    //public static void main(String[] args) {
        //int euro = Converter.rubleToEuro(400);
        //System.out.println("400 rubles are " + euro + " euro.");
        //int dollar = Converter.rubleToDollar(400);
        //System.out.println("400 rubles are " + dollar + " dollar.");
        //}
        public static void main(String[] args) {
            int inEuro = 140;
            int expectedEuro = 2;
            int outEuro = Converter.rubleToEuro(inEuro);
            boolean passedEuro = expectedEuro == outEuro;
            System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);

            int inDollar = 180;
            int expectedDollar = 3;
            int outDollar = Converter.rubleToDollar(inDollar);
            boolean passedDollar = expectedDollar == outDollar;
            System.out.println("140 rubles are 3 dollars. Test result : " + passedDollar);

        }
    }


