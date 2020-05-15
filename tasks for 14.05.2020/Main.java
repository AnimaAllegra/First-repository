package com.company;
//Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
//Напоминаем, что первый и второй члены последовательности равны единицам,
//а каждый следующий — сумме двух предыдущих.
public class Main {

    public static void main(String[] args) {
	int n0 = 1;
	int n1 = 1;
	int n2;
        System.out.print(n0 + " " + n1 + " ");
        for(int i = 3; i<=20; i++){
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
}
