package com.company;
//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
public class task2 {

    public static void main(String[] args) {
	int a = 0;
	for (int i = 1; i<=21; i++){
	    if(i%2!=0){
	        a++;
        }
    }
	int[] arr = new int[a];
	for(int i = 1, b = 0; i<21; i++){
	    if(i%2!=0){
	        arr[b] = i;
            System.out.print(arr[b] + " ");
            b++;
        }
    }
        System.out.println(" ");
	for(int i = arr.length-1; i>=0; i--)//что делает "-1" в данном случае?И почему без него не работает?
	{
        System.out.print(arr[i] + " ");
    }
    }
}
