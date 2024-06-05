package org.example;

import java.util.Scanner;

public class Ulduz {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < a-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
