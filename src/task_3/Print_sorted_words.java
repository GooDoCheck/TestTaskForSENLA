package task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Print_sorted_words {
    public static String[] arrayOfString;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите слова одной строкой через пробел");
        String theSentence = reader.readLine();
        arrayOfString = delimiterOfSentence(theSentence);
        firstUpperCase(arrayOfString);
        Arrays.sort(arrayOfString);
        printArrays(arrayOfString);
    }
    public static String[] delimiterOfSentence(String sentence) {
        String[] subStr;
        String delimiter = " ";
        subStr = sentence.split(delimiter);
        return subStr;
    }

    public static void  printArrays(String[] array){
        System.out.println("В предложении " + array.length + " слов.");
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static void firstUpperCase(String[] subListOfString){
        String tempString;
        for (int i = 0; i <= subListOfString.length - 1; i++){
            tempString = subListOfString[i];
            subListOfString[i] = tempString.substring(0, 1).toUpperCase() + tempString.substring(1);
        }

    }
}
