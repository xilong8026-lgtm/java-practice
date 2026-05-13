package com.demo1;

import java.util.Scanner;

public class ArithmeticoperatorDemo6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个老虎的体重:");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个老虎的体重:");
        int number2 = sc.nextInt();

        String result = number1 == number2 ? "相同" : "不相同";
        System.out.println(result);
    }
}
