package com.demo3;

import java.util.Scanner;

public class SwitchTset1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数");
        int week = sc.nextInt();

        switch (week){
            case 1,2,3,4,5 -> System.out.println("工作日");

            case 6,7 -> System.out.println("休息日");

            default -> System.out.println("您写错了");
        }
    }
}
