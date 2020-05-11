package com.company;
//Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 …
public class zd4 {
    public static void main(String[] args) {
        int i = 0;
        int b = 2;
        do {
            System.out.println(b + " ");
            b*=2;
            i++;
        }while(i<=20);
    }
}
