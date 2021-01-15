package task_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Search_for_LCM_and_GCD {
    public static boolean check = true;
    public static long numberA =  0;
    public static long numberB = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа через пробел: ");
        try {
            numberA = scanner.nextLong();
            numberB = scanner.nextLong();
        } catch (InputMismatchException e) {
            check = false;
            System.out.println("Вы ввели не целое число!");
        }
        if (check){
            System.out.println("Наибольший общий делитель - " + greatestCommonDivisor(numberA, numberB));
            System.out.println("Наименьшее общее кратное - " + leastCommonMultiple(numberA, numberB));
        }
    }

    public static long leastCommonMultiple (long a, long b) {
        return a / greatestCommonDivisor(a,b) * b;

    }

    public static long greatestCommonDivisor (long a, long b) {
        return b == 0 ? a : greatestCommonDivisor(b,a % b);
    }
}
