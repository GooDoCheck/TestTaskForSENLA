package task_4;

import java.util.Scanner;

public class Find_word_in_text {
    public static String text;
    public static String word;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст в котором необходимо найти слово:");
        text = scanner.nextLine();
        System.out.println("Введите слово которое необходимо найти:");
        word = scanner.nextLine();
        System.out.println("Слово " + word + " встречается " + searchWord(text, word) + " раз.");
    }
    public static int searchWord(String text, String word) {
        text = text.toLowerCase();
        word = word.toLowerCase();
        int i = text.indexOf(word);
        int count = 0;
        while (i >= 0) {
            count++;
            i = text.indexOf(word, i + 1);
        }
        return count;
    }

}
