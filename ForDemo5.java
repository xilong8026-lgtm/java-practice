package com.demo3;

public class ForDemo5 {
    static void main() {
        //1,定义一个变量用来记录山峰的高度
        //2.定义一个变量来记录纸张的初始厚度
        //3.定义一个变量统计次数
        //4.循环折叠纸张,只要纸张额厚涂小于山峰的高度,那就循环继续
        //没折叠一次,统计次数就要++
        int old = 8844430;
        double a = 0.1;
        int i = 0;
        while( a < old){
            a = a * 2;
            i++;
        }
        System.out.println(i);

    }
}
