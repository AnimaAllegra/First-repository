package com.company;
//Создайте два массива из 10 целых случайных чисел из отрезка [1;9]
//и третий массив из 10 действительных чисел.
//Каждый элемент с i-ым индексом третьего массива
//должен равняться отношению элемента из первого массива с i-ым индексом
//к элементу из второго массива с i-ым индексом.
//Вывести все три массива на экран (каждый на отдельной строке),
//затем вывести количество целых элементов в третьем массиве.
//Вопрос такой: какого дъявола прога считывает только первое целое число и дальше не идёт,
//даже когда в списке есть ещё целые числа, выдаёт тупо только одно и это всегда(!)первое!
public class zd3 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        double[] arr3 = new double[10];
        int cc = 0;
        System.out.println("Числа в массиве 1 следующие: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1 + (int) (Math.random() * 9);
            System.out.print(arr1[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Числа в массиве 2 следующие: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 1 + (int) (Math.random() * 9);
            System.out.print(arr2[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Числа в массиве 3 следующие: ");
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (double) arr1[i] / arr2[i];
            System.out.print(arr3[i] + " ");
        }
        for(int i = 0; i<arr3.length; i++){
                if (arr3[i] % (int) arr3[i] == 0) {
                    if (cc == 0) {
                        System.out.println("\nЦелые числа следющие:");
                        cc++;
                        System.out.print(arr3[i] + " ");

                    }
        /*int n0 = 1;
        int n2;
        for(int i=0; i<arr3.length; i++){
            n2 = n0;
            System.out.print(n2+" ");
            n0++;*/
                }
            }
        }
    }
