package task_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Find_polindrom {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длинну последовательности от 0 до 100: ");
        try {
            int n = in.nextInt();
            if (!(n < MIN_VALUE || n > MAX_VALUE)) {
                for (int i = MIN_VALUE; i < n + 1; i++) {
                    if (isPalindrome(i)) System.out.println(i);
                }
            } else System.out.println("Длинна последовательности чисел должна быть в пределах от 0 до 100.");

        } catch (InputMismatchException e) {
            System.out.println("Некорректный ввод.");
        }
    }
        static boolean isPalindrome(int i) {
            int next = 0;
            int temp = i;

            while (temp != 0) {
                next = (next * 10) + (temp % 10);
                temp /= 10;
            }
            return i == next;
        }

}