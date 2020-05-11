package com.company;
// Создайте массив из 8 случайных целых чисел из отрезка [1;10].
// Выведите массив на экран в строку.
// Замените каждый элемент с нечётным индексом на ноль.
// Снова выведете массив на экран на отдельной строке.
public class Main {
    public static void main(String[] args) {
	int[] arr = new int[8];
	for(int i = 0; i < arr.length; i++){
	    arr[i] = 1 + (int) (Math.random()*10);
        System.out.print(arr[i] + " ");
    }
        System.out.println("\n ");
	for(int j = 0; j < arr.length; j++){
	    if(arr[j]!=0){
	        arr[j] = 0;
            System.out.print(arr[j] + " ");
        }
    }
    }
}
