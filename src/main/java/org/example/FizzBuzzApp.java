package org.example;

import java.util.Scanner;

public class FizzBuzzApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        int num=sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num*i);
        }

        int factorial=1;
        for (int i = 1; i <=num; i++) {
            factorial=factorial*i;
        }
        System.out.println(factorial);


        int numm=sc.nextInt();
        int power=sc.nextInt();

        int mult=1;
        for (int i = 0; i < power; i++) {
            mult=mult*numm;
        }
        System.out.println(mult);

    }
}
