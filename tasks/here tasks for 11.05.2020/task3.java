package com.company;
//Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
public class task3 {
    public static void main(String[] args) {
        int chot = 0;
        int niechot = 0;
        int[] arr = new int[15];
        for(int i = 0; i<arr.length; i++){
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + " ");
        }
        for(int j = 0; j<arr.length; j++){
            if(arr[j]%2==0){
                chot++;
            }else if(arr[j]%2!=0){
                niechot++;
            }
        }
        System.out.print("\nЧётные: " + chot);
        System.out.print("\nНечётные: " + niechot);
    }
}
