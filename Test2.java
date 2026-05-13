package com.demo2;

import java.util.Scanner;

public class Test2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入支付金额");
        double money = sc.nextDouble();

        if(money >= 600 ){
            System.out.println("成功");
        } else{
            System.out.println("失败");
        }
    }
}
