package com.company;
//Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 …
public class zd4 {
    public static void main(String[] args) {
        for(int i =1, b=2; i<=20; i++, b=b*2){
            System.out.print(b + " ");
        }
    }
}
