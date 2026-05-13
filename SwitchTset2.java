package com.demo3;

import java.util.Scanner;

public class SwitchTset2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数表示您的选择");
        int choos = sc.nextInt();

        switch (choos){
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预订");
            case 3 -> System.out.println("机票改签");
            default -> System.out.println("退出服务");
        }
    }
}
