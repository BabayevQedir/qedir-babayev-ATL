package org.example;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 String a=new String("Salam");
 String b =new String("Salam");
 if (a==b){
     System.out.println("true");
 }
 else {
     System.out.println("false");
 }
        char x = '*';
        char y = '=';
        char z = ' ';
        char[][] arr = new char[14][45];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                if (j < 9 && i < 12) {
                    if (((i + j + 1) % 2 == 1 || (i + j) == 0) && (j % 2) + i != 12) {
                        arr[j][i] = x;
                    } else {
                        arr[j][i] = z;
                    }
                } else {
                    arr[j][i] = y;
                }
            }
        }

        for (char[] g : arr) {
            for (char bb : g) {
                System.out.print(bb + "");
            }
            System.out.println("");
        }
    }
}