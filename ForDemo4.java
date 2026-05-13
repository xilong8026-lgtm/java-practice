package com.demo3;

import java.util.Scanner;

public class ForDemo4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个数字");
        int start = sc.nextInt();
        System.out.println("请录入一个数字");
        int end = sc.nextInt();

        int count = 0;

        for (int i = start; i <= end; i++) {
            if(i % 3 == 0 && i % 5 == 0 ){
                //System.out.println(i);
                count++;

            }
        }
        System.out.println(count);

    }
}
