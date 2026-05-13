package com.demo3;

public class Switchdemo {
    static void main() {
        //兰州拉面,武汉热干面,北京炸酱面,油泼面

        //1.定义变量记录
        String noodles = "zd";


        //2.拿着这个面匹配
        switch (noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "油泼面":
                System.out.println("吃油泼面");
                break;
            default:
                System.out.println("吃方便面");
                break;

        }
    }
}
