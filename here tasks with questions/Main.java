package com.company;
// Создайте массив из 4 случайных целых чисел из отрезка [10;99],
// выведите его на экран в строку.
// Определить и вывести на экран сообщение о том,
// является ли массив строго возрастающей последовательностью.
public class Main {

    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + (int) (Math.random() * 90);
            System.out.println(array[i]);
        }
        boolean ascending = true;
        for (int i=1; i< array.length; i++) {
            if(array[i-1]>array[i]) {
                ascending = false;
            }
        }
        /*why this don't work???
        WHY this :
        array[i+1]>array[i]
        not same this:
        array[i-1]>array[i]
        ???????????????????
        for (int i=0; i< array.length; i++) {
            if(array[i+1]>array[i]) {
                ascending = true;
            }
        }
        ???????????????????
         */
        System.out.println("Array is ascending: " + ascending);
    }
}



