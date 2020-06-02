package com.company;
//Создать двумерный массив из 6 строк по 7 столбцов в каждой
//из случайных целых чисел из отрезка [0;9].
//Вывести массив на экран. Преобразовать массив таким образом,
//чтобы на первом месте в каждой строке стоял её наибольший элемент.
//При этом изменять состав массива нельзя,
//а можно только переставлять элементы в рамках одной строки.
//Порядок остальных элементов строки не важен
//(т.е. можно соврешить только одну перестановку,
//а можно отсортировать по убыванию каждую строку).
//Вывести преобразованный массив на экран.
public class sas {
    public static void main(String[] args) {
        final int row = 6;
        final int column = 7;

        int[][] arr = null;
        arr = generate(row, column, arr);//

        int max = 0;
        int indexMax= 0;
        for (int i = 0; i < row; i++) {// idex 0..5
            for (int j = 0; j < column; j++) {// c
                if(arr[i][j]>max) {
                    max = arr[i][j];
                    indexMax = j;
                }
                if(column == j+1) { // проверка на последний ел. в строке
                    int temp = arr[i][0];
                    arr[i][0]= max;
                    arr[i][indexMax]= temp;
                    max=0;
                    indexMax=0;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Index Max str " + i + ": ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    private static int[][] generate(int row, int column, int[][] arr)
    {
        arr= new int[row][column];

        for (int i = 0; i < row; i++) {
            System.out.print("\nIndex " + i + ": ");
            for (int j = 0; j < column; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j] + " ");
            }
        }
        return arr;
    }
}

    /*public static void main(String[] args) {
        int max = 0, ind = 0;
        int[][] arr = new int[6][7];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\nIndex " + i + ": ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j] + " ");
            }
            int len = arr.length;
            for (int k = 0; k < len; k++) {
                for (int l = 0; l < len; l++) {
                    for (int m = 0; m < arr[i].length - 1; m++) {
                        if (arr[l][m] < arr[l][m + 1]) {
                            int temp = arr[l][m];
                            arr[l][m] = arr[l][m + 1];
                            arr[l][m + 1] = temp;
                        }
                    }
                }
            }
        }
                System.out.println(" ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print("Index sort str " + i + ": ");
                    for (int j = 0; j < arr[i].length; j++) {
                            System.out.print(arr[i][j] + " ");
                    }
                    System.out.println(" ");
                }
            }
        }
/*int masx = arr[i-1]
        int mask = arr[0][j];*/
/* int max = 0, ind = 0;
                if (j == 0) {
                    max = arr[i][j];
                } else {
                    if (max < arr[i][j]) {
                        max = arr[i][j];
                        ind = j;
                    }
                }
                if (j == arr[i].length - 1) {
                    int temp = arr[i][0];
                    arr[i][0] = arr[i][ind];
                    arr[i][ind] = temp;
                }
            }*/

        /*if (j == 0){
                    max = arr[i][j];
                }else{
                    if(max<arr[i][j]){
                        max=arr[i][j];
                        ind = j;
                    }
                }
                if(j==arr[i].length-1){
                    int temp = arr[i][0];
                    arr[i][0]=arr[i][ind];
                    arr[i][ind]=temp;
                }*/


