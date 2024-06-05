package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("sual 1");
        System.out.println("");
        System.out.println("Hello \nBabayev Qedir");
        System.out.println("");
        System.out.println("sual 2");
        System.out.println("");
        int a = 74;
        int b = 36;
        System.out.println(a + b);
        System.out.println("");
        System.out.println("sual 3");
        System.out.println("");
        System.out.println(50 / 3);
        System.out.println("");
        System.out.println("sual 4");
        System.out.println("");
        System.out.println(-5 + 8 * 6 + "\n" + (55 + 9) % 9 + "\n" + (20 + -3 * 5 / 8) + "\n" + (5 + 15 / 3 * 2 - 8 % 3));
        System.out.println("");
        System.out.println("sual 5");
        System.out.println("");
        System.out.println("enter 1 number");
        int i = sc.nextInt();
        System.out.println("enter 2 number");
        int j = sc.nextInt();
        System.out.println(i * j);
        System.out.println("");
        System.out.println("sual 6");
        System.out.println("");
        System.out.println("Input first number: ");
        int k = sc.nextInt();
        System.out.println("Input second number: ");
        int d = sc.nextInt();
        System.out.println(k + "+" + d + "=" + (k + d));
        System.out.println(k + "-" + d + "=" + (k - d));
        System.out.println(k + "*" + d + "=" + (k * d));
        System.out.println(k + "/" + d + "=" + (k / d));
        System.out.println(k + "%" + d + "=" + (k % d));
        System.out.println("");
        System.out.println("sual 7");
        System.out.println("");
        System.out.println("enter a number for multiple table");
        int number = sc.nextInt();
        for (int aa = 1; aa <= 10; aa++) {
            System.out.println(number + "*" + aa + "=" + number * aa);
        }
        System.out.println("");
        System.out.println("sual 8");
        System.out.println("");

        // Write a Java program to display the following pattern.
        //Sample Pattern :
        //
        //   J    a   v     v  a
        //   J   a a   v   v  a a
        //J  J  aaaaa   V V  aaaaa
        // JJ  a     a   V  a     a
        //

        String java = "Java";
        char[] chars = java.toCharArray();
        for (int q = 0; q < java.length(); q++) {
            for (int w = 0; w < 25; w++) {

            }
        }
        System.out.println("");
        System.out.println("sual 9");
        System.out.println("");

        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

        System.out.println("");
        System.out.println("sual 10");
        System.out.println("");

        System.out.println(4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));

        System.out.println("");
        System.out.println("sual 11");
        System.out.println("");
        System.out.println("radiusu daxil et");
        int radius = sc.nextInt();

        System.out.println("sahe=" + (3.14 * radius * radius));
        System.out.println("perimetr =" + (2 * 3.14 * radius));


        System.out.println("");
        System.out.println("sual 12");
        System.out.println("");

        System.out.println("enter three number for average");
        int fn = sc.nextInt();
        int sn = sc.nextInt();
        int tn = sc.nextInt();
        System.out.println((fn + sn + tn) / 3);

        System.out.println("");
        System.out.println("sual 13");
        System.out.println("");

        System.out.println("enter rectangle weight ");
        double weight = sc.nextInt();

        System.out.println("enter rectangle height ");
        double height = sc.nextInt();

        System.out.println("rectangle area=" + (weight * height));
        System.out.println("rectangle perimeter=" + (2 * (weight + height)));

        System.out.println("");
        System.out.println("sual 14");
        System.out.println("");
        char x = '*';
        char y = '=';
        char z = ' ';
        char[][] arr = new char[14][45];
        for (int jj = 0; jj < arr.length; jj++) {
            for (int ii = 0; ii < arr[jj].length; ii++) {
                if (jj < 9 && ii < 12) {
                    if (((ii + jj + 1) % 2 == 1 || (ii + jj) == 0) && (jj % 2) + ii != 12) {
                        arr[jj][ii] = x;
                    } else {
                        arr[jj][ii] = z;
                    }
                } else {
                    arr[jj][ii] = y;
                }
            }
        }

        for (char[] g : arr) {
            for (char bb : g) {
                System.out.print(bb + "");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("sual 15");
        System.out.println("");


        int aa = 10;
        int bbb = 20;

        aa = aa + bbb;
        bbb = aa - bbb;
        aa = aa - bbb;

        System.out.println("a=" + aa + "\nb=" + bbb);


        System.out.println("");
        System.out.println("sual 16");
        System.out.println("");

        System.out.println("+\"\"\"\"\"+                                                 \n" +
                "[| o o |]                                                \n" +
                " |  ^  |                                                 \n" +
                " | '-' |                                                 \n" +
                " +-----+");

        System.out.println("");
        System.out.println("sual 17");
        System.out.println("");

        System.out.println("enter first binary number ");
        long binary1 = sc.nextLong();
        System.out.println("enter second binary number ");
        long binary2 = sc.nextLong();

        int period = 0, remainder = 0;
        int[] sum = new int[20];

        while (binary1 != 0 || binary2 != 0) {
            sum[period++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        if (remainder!=0){
            sum[period++]=remainder;
        }

        period--;

        System.out.println("sum two binary number = ");

        while (period>=0){
            System.out.print(sum[period--]);
        }


    }
}
