package com.demo2;

import java.util.Scanner;

public class OrderDemo {
    //if格式
    //if(关系表达){
        //语句体;
    //}
    static void main() {
        //分析
        //1键盘录入女婿的酒量

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量");
        int wine = sc.nextInt();

        //2.对酒量进行判断
        if( 2 < wine ){
            System.out.println("小伙子.真不错");

        }
    }

}
