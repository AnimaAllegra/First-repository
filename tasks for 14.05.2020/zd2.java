package com.company;
//Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
//Определите какой элемент является в этом массиве максимальным
//и сообщите индекс его последнего вхождения в массив.
public class zd2 {
    public static void main(String[] args) {
        int[] arr = new int[12];
        int max = arr[0];
        int ind = 0;
        for(int i = 0; i<arr.length; i++){
            arr[i] = (int) (Math.random() * (30+1))-15;
            System.out.print(arr[i]+" ");
            if(max < arr[i]){
                max = arr[i];
                ind = i;
            }
        }
        System.out.println("\nmax index is: "+ind+"\nmax numb is: "+max);
    }
}
