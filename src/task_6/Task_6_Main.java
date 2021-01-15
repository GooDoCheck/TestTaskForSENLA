package task_6;
import java.util.Scanner;

public class Task_6_Main {
    private static final Scanner scanner = new Scanner(System.in);

    static void runInterface(){
        try {
            System.out.println("Введите максимальный вес, который можно поместить в рюкзак:");
            int maxWeight = scanner.nextInt();
            Backpack backpack = new Backpack(maxWeight);
            System.out.println("Введите число предметов");
            int itemsCount = scanner.nextInt();
            for (int i = 0; i < itemsCount; i++) {
                System.out.println("Введите вес и стоимость предмета через пробел " + (i+1));
                int weight = scanner.nextInt();
                int cost = scanner.nextInt();
                Item item = new Item(weight, cost);
                backpack.getItems().add(item);
            }

            backpack.fillBackpack();

            System.out.println("Сумарная ценность груза рюкзака: " + backpack.getCost());
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Неправильный ввод, попробуй снова.");
        }

        System.out.println();
    }
    public static void main(String[] args) {
        runInterface();
    }
}