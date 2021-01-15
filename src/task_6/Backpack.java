package task_6;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private int maxWeight;
    private int cost;
    private int maxCost;
    private ArrayList<Item> availableItems = new ArrayList<>();

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMaxCost() {
        return maxCost;
    }

    public void setMaxCost(int maxCost) {
        this.maxCost = maxCost;
    }

    public List<Item> getItems() {
        return availableItems;
    }

    public void setItems(ArrayList<Item> items) {
        this.availableItems = items;
    }

    public Backpack(int maxWeight){
        this.maxWeight = maxWeight;
        maxCost = -100;
    }

    private int a(int count, int weight){
        if (count == 0 || weight == 0) return 0;

        if (weight - availableItems.get(count-1).getWeight() < 0) return a(count-1, weight);
        return Math.max(availableItems.get(count-1).getCost() + a(count-1, weight - availableItems.get(count-1).getWeight()), a(count-1, weight));
    }

    void fillBackpack(){
        for (int i = 0; i < availableItems.size(); i++) {
            for (int j = 0; j < maxWeight; j++) {
                cost = a(i, j);
            }
            if (cost > maxCost)
                maxCost = cost;
        }
    }
}