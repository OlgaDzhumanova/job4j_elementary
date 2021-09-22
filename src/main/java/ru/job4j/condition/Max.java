package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
       return max(first, second) > third ? max(first, second) : third;
    }

    public static int max(int first, int second, int third, int four) {
       return max(first, second, third) > four ? max(first, second, third) : four;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(6, 9));
        System.out.println(Max.max(7, 8, 0));
        System.out.println(Max.max(5, 23, 45, 7));
    }
}

