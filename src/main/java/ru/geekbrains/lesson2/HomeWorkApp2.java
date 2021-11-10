package ru.geekbrains.lesson2;

import com.sun.source.util.SourcePositions;

import javax.lang.model.element.Name;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(within10and20(15, 5));
        isPositiveOrNegative(-10);
        System.out.println(isNegative(10));
        printWordNTimes("Pavel", 5);
        System.out.println();
        System.out.println(yearBingo(2021));
    }
    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20)
            return true; return false;
    }
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println(x + " положительное число");
        } else System.out.println(x + " число отрицательное");
    }
    public static boolean isNegative(int x) {
        if (x >= 0)
            return true; return false;
    }
    public static void printWordNTimes(String Name, int number) {
        if (number != 0) {
        for (int i = 0; i < number; i++) {
            System.out.print(Name + " ");}
        } else
        System.out.println("You can't put 0 ");
    }
    public static boolean yearBingo(int year) {
        if (((year %4 == 0) && (year %100 != 0)) ||( year %400 ==0)){
            return true;
        }
        return false;
    }
}
