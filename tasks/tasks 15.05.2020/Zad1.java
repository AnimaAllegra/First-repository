package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Пользователь должен указать с клавиатуры чётное положительное число,
//а программа должна создать массив указанного размера
//из случайных целых чисел из [-5;5] и вывести его на экран в строку.
//После этого программа должна определить и сообщить пользователю о том,
//сумма модулей какой половины массива больше: левой или правой,
//либо сообщить, что эти суммы модулей равны.
//Если пользователь введёт неподходящее число,
//то программа должна требовать повторного ввода до тех пор,
//пока не будет указано корректное значение.
public class Zad1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Пожалуйста введите положительное чётное число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        Integer qw = Integer.parseInt(s);
        int mod = 0;
        int mod2 = 0;
        for (int j = 1; j <= 1; j++) {
            if (qw > 0 && qw % 2 == 0) {
                int[] arr = new int[qw];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (int) (Math.random() * (10 + 1)) - 5;
                    System.out.println(arr[i] + " ");
                    if (i <= arr.length / 2 - 1) {//speak about this later!!!"-1","=";
                        mod += Math.abs(arr[i]);
                        //mod = Math.abs(arr[i])+Math.abs(arr[i]); this is the same???
                    } else {
                        mod2 += Math.abs(arr[i]);
                    }
                    if (i == arr.length - 1) {//значит ли это то, что "сли i проходит весь массив, то"??
                        System.out.println(" ");
                        if (mod > mod2) {
                            System.out.println("Сумма модулей первой половины больше и равняется: " + mod);
                        }
                        if (mod < mod2) {
                            System.out.println("Сумма модулей второй половины больше и равняется: " + mod2);
                        }
                        if (mod == mod2) {
                            System.out.println("Суммы модулей равны.");
                        }
                    }
                }
            }
            }

        }
    }

