package lesson_1.HW1.Fruits;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit>{

    private ArrayList<T> list;

    public Box(T... fruitArr) {
        this.list = new ArrayList<>(Arrays.asList(fruitArr));
    }

    public void add(T obj){
        list.add(obj);
    }

    public float getWeight(){
        float weight = 0.0f;
        for (Fruit f : list) {
            weight += f.getWeightOneFruit();
        }
        return weight;
    }

    public boolean compare(Box<T> another){
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

//    public static <T> void replaceFruits(Box<? super T> dest, Box<? extends T> src){
//        if (dest.getClass().getSimpleName().equals(src.getClass().getSimpleName())){
//            System.out.println("Нельзя пересыпать фрукты в ту же самую коробку");
//            return;
//        }
//
//        dest.addAll(src);
//        src.clear();
//    }

}
