package com.company;
//Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10]
//таким образом, чтобы отрицательных и положительных элементов там было поровну
//и не было нулей.
public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int[] arr = new int[12];
        do {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 21) - 10;
                if (arr[i] < 0) {
                    a++;
                }
                if (arr[i] > 0) {
                    b++;
                }
                if (arr[i] == 0) {
                    --i;//тут имеем удивительный ход!Если число == 0, то отбрасываем итерацию назад, опять генерится рандомное число, и итерация опять продолжается, круто!
                }
                if (i == arr.length - 1 && a != arr.length / 2) {
                    a = 0;
                    b = 0;
                }
            }
        } while (a != arr.length / 2 && b != arr.length / 2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
