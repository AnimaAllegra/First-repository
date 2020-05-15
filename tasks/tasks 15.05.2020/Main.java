package com.company;
//Создайте массив из 11 случайных целых чисел из отрезка [-1;1],
//выведите массив на экран в строку.
//Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
//Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[11];
        int ss01 = 0, ss0 = 0, ss1 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (2 + 1)) - 1;
            System.out.print(arr[i] + " ");
            if(arr[i]<0){
                ss01++;
            }
            if(arr[i]>0){
                ss0++;
            }
            if(arr[i]==0){
                ss1++;
            }
            if(i==arr.length-1){
                if(ss01>ss0&&ss01>ss1){
                    System.out.println("\nЧаще всего встречается -1 : "+ss01+" раз");
                }
                if(ss0>ss01&&ss0>ss1){
                    System.out.println("\nЧаще всего встречается 1 : "+ss0+" раз");
                }
                if(ss1>ss0&&ss1>ss01){
                    System.out.println("\nЧаще всего встречается 0 : "+ss1+" раз");
                }
            }
                }
            }
        }