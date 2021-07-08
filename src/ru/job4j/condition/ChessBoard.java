package ru.job4j.condition;

public class ChessBoard {
    public static boolean isWay(int num) {
        return (num >= 0) && (num <= 7);
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isWay(x1) && isWay(y1) && isWay(x2) && isWay(y2)) {
            rsl = Math.abs(y2 - y1);
            rsl = rsl == Math.abs(x2 - x1) ? rsl : 0;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(way(7, 0, 0, 7));
    }
}
