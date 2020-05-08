package com.company;

public class Main {

    public static void main(String[] args) {
	int [] a = new int [20];
	int [] b = new int[20];
	int j = 0;
	for (int i = 0; i<=a.length;i++){
	    if(i %2 == 0){
            System.out.print(i + " ");
        }
    }
	for (int s = 0; s<=b.length; s++){
	    if(s %2 == 0){
            System.out.println(s + " ");
        }
    }
    }
}
