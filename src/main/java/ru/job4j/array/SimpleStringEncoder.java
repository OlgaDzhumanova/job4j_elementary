package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;

        for (int index = 1; index < input.length(); index++) {
            if (input.charAt(index) == symbol) {
                counter++;
            } else {
                result += (counter > 1 ? symbol + String.valueOf(counter) : String.valueOf(symbol));
                symbol = input.charAt(index);
                counter = 1;
            }
        }
        result += (counter > 1 ? symbol + String.valueOf(counter) : String.valueOf(symbol));
        return result;
    }
}