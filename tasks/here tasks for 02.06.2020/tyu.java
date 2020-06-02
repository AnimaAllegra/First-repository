package com.company;
//Cоздать двумерный массив из 7 строк по 4 столбца в каждой
//из случайных целых чисел из отрезка [-5;5].
//Вывести массив на экран.
//Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
//Если таких строк несколько, то вывести индекс первой встретившейся из них.
public class tyu {
    public static void main(String[] args) {
        int[][] arr = new int[7][4];
        int[] arr0 = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            System.out.print("ID :" + i + " ");
            for(int j = 0; j<arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 11) - 5;
                System.out.print(arr[i][j]+ " ");
                if (j == 0) arr0[i] = arr[i][j];
                else arr0[i] *= arr[i][j];
                if(j==arr[i].length-1)
                    System.out.println(" ");
            }
        }
        int max=0,maxi=0;
        for(int i = 0; i<arr0.length; i++){
            if(Math.abs(arr0[i])>max){
                max = arr0[i];
                maxi = i;
            }
        }
        System.out.println("Строка с наибольшим по модулю произведением элементов ("+max+") имеет индекс - "+maxi);
    }
}
