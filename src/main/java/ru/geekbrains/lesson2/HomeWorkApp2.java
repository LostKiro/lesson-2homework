package ru.geekbrains.lesson2;

import com.sun.source.util.SourcePositions;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        within10and20();
        isPositiveOrNegative();
        isNegative();
        printWordNTimes();
        
    }

    public static boolean within10and20() {
        int x1 = 9;
        int x2 = 1;
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            System.out.println("Число " + sum + " в пределах");
            return true;
        } else {
            System.out.println("Число " + sum + " не в пределах");
            return false;
        }
    }

    public static void isPositiveOrNegative() {
        int x = 0;
        if (x >= 0) {
            System.out.println(x + " положительное число");
        } else {
            System.out.println(x + " число отрицательное");
        }
    }

    public static boolean isNegative() {
        int x = 1;
        if (x >= 0) {
            System.out.println(false);
            return true;
        } else {
            System.out.println(true);
            return false;
        }
    }

    public static void printWordNTimes() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Name");
        }
    }

    public static boolean years(int year) {
        if (((year %4 == 0) && (year %100 != 0)) ||( year %400 ==0)){
            return true;
        }
        return false;
    }
}

