package lesson_4;

public class Bowl {
    private int foodAmount;

    public Bowl(int initialFood) {
        this.foodAmount = initialFood;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавлено " + amount + " гр. еды. Теперь всего: " + foodAmount);
        } else {
            System.out.println("Нельзя добавить отрицательное количество еды.");
        }
    }

    public void decreaseFood(int amount) {
            foodAmount -= amount;
        }

    public int getFood() {
        return foodAmount;
    }
}