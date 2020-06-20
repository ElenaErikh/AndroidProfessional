package lesson_1.HW1.Fruits;

public class Fruit {
    private float weightOneFruit;
    private int amount;

    public Fruit(float weightOneFruit, int amount) {
        this.weightOneFruit = weightOneFruit;
        this.amount = amount;
    }

    public Fruit() {
    }

    public Fruit(float weightOneFruit) {
        this.weightOneFruit = weightOneFruit;
    }

    public float getWeightOneFruit() {
        return weightOneFruit;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
