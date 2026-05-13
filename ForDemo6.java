package com.demo3;

public class ForDemo6 {
    static void main() {
       /* //核心子路,把数字倒过来跟原来的数字一样\
        //1定义数字
        int x = 12345;
        //2,获得个位
        int ge = x % 10;
        int shi = x / 10 % 10;*/

        //1定义数字
        int x = 12345;
        //定义一个临时变量用于记录X原来的值
        int temp = x;
        int num = 0;
        //利用循环开始从右往左获取每一个数字
        while(x != 0){
            //从右往左获取每一个数字
            int ge = x % 10;
            //修改一下X记录的值
            x = x / 10;
            //把当前获取的数字拼接最右边
            num = num * 10 + ge;


        }
        //.打印num
        System.out.println(num);
        System.out.println(x);
        //4.比较
        System.out.println(num == temp);


    }
}
