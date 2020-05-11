package com.company;
//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5]
// каждый, выведите массивы на экран в двух отдельных строках.
// Посчитайте среднее арифметическое элементов каждого массива
// и сообщите, для какого из массивов это значение оказалось больше
// (либо сообщите, что их средние арифметические равны).
public class PsihopatLunatik {
    public static void main(String[] args) {
        double sAarr = 0;
        double sAlist = 0;
        int[] arr = new int[5];
        int[] list = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 6);
            System.out.print(arr[i] + " ");
            sAarr+=(double)arr[i]/arr.length;

        }
        System.out.println("\n");
        System.out.print("Среднее 1: " + sAarr);
        System.out.println("\n");
        for(int j = 0; j < list.length; j++){
            list[j] = (int) (Math.random() * 6);
            System.out.print(list[j] + " ");
            sAlist+=(double)list[j]/list.length;
        }
        System.out.println("\n");
        System.out.println("Среднее 2: " + sAlist);
        if(sAarr>sAlist){
            System.out.print("Среднее 1 - больше");
            System.out.println("\n");
        }else if(sAarr<sAlist){
            System.out.print("Среднее 2 - больше");
            System.out.println("\n");
        }else{
            System.out.println("Они равны.");
        }
    }
}
