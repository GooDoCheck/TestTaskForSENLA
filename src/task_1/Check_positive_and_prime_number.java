package task_1;

import java.util.Scanner;

public class Check_positive_and_prime_number {
    public static boolean integerCheck = false;
    public static float numberFloat =  0;
    public static int numberInteger = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        numberFloat = scanner.nextFloat();
        integerNumberCheck(numberFloat);
        if (integerCheck){
            System.out.println("Число " + numberInteger + " - " + positiveNumberCheck(numberInteger) + primeNumberCheck(numberInteger));
        }
    }

    public static void integerNumberCheck(float number) {
        if (number % 1 == 0) {
            numberInteger = (int) number;
            integerCheck = true;
        } else {
            System.out.println("Ошибка! Введено не целое число");
        }

    }

    public static String positiveNumberCheck (int checkNum) {
        if (checkNum % 2 == 0)
            return " четное";
        else
            return " нечетное";
    }

    public static String primeNumberCheck (int checkNum) {
        int temp;
        boolean isPrime = true;
        for (int i=2; i<=checkNum/2; i++) {
            temp = checkNum % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            return  " простое число.";
        } else {
            return " составное число.";
        }
    }

}
