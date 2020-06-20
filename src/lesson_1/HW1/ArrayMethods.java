package lesson_1.HW1;

import java.util.Arrays;
import java.util.List;

public class ArrayMethods {

    public static void main(String[] args) {

        String[] array = {"one", "two", "three", "four", "five"};
        System.out.println(Arrays.toString(changePlacesOfTwoElements(array, 1, 3)));
        System.out.println("List: " + getListFromArray(array));

    }

     static <T> T[] changePlacesOfTwoElements (T[] arr, int firstValue, int secondValue){
         T first = null;
         T second = null;
         for (int i = 0; i < arr.length; i++) {
            if (firstValue >= arr.length || secondValue >= arr.length){
                throw new ArrayIndexOutOfBoundsException("Введите значение от 0 до " + (arr.length-1));
            }
            if (i == firstValue){
                first = arr[i];
            }
            if (i == secondValue){
                second = arr[i];
            }
        }
         arr[firstValue] = second;
         arr[secondValue] = first;
         return arr;
    }

    public static <T> List<T> getListFromArray(T[] arr){
        List<T> list = Arrays.asList(arr);
        return list;
    }



}
