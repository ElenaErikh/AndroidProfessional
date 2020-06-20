package lesson_1.HW1.Fruits;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxWithApples1 = new Box<>(apple, apple);
        Box<Apple> boxWithApples2 = new Box<>();
        boxWithApples1.add(apple);
        boxWithApples1.add(apple);
        boxWithApples1.add(apple);
        System.out.println(apple.getWeightOneFruit());

        Box<Orange> boxWithOranges = new Box<>();
        boxWithOranges.add(orange);
        boxWithOranges.add(orange);
        boxWithOranges.add(orange);
        boxWithOranges.add(orange);

        System.out.println(boxWithApples1.getWeight());
        System.out.println(boxWithApples2.getWeight());
        System.out.println(boxWithOranges.getWeight());

        System.out.println(boxWithApples1.compare(boxWithApples2));


    }
}
