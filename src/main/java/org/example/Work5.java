package org.example;

import java.util.Scanner;

public class Work5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int numm=sc.nextInt();
        int power=sc.nextInt();

        int mult=1;
        for (int i = 0; i < power; i++) {
            mult=mult*numm;
        }
        System.out.println(mult);
    }
}
