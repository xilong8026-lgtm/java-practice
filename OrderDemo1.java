package com.demo2;

public class OrderDemo1 {
    static void main() {
       //汽车无人驾驶会涉及到的判断
       //当汽车行驶的时候遇到了红绿灯,就会进行判断
       //如果红灯亮,就停止
       //如果黄灯亮,就减速
       //如果绿灯亮,就行驶

       //1.定义三个表示的灯的状态
       //true 亮 false 灭
       boolean islightGreen = true;
       boolean islightYellow = false;
       boolean islightRed = false;

       //2.判断
       //红灯亮,就停止
       //黄灯亮,就减速
       //绿灯亮,就行驶
       if(islightRed){
           System.out.println("stop!!!");
        }
       if(islightYellow){
           System.out.println("slow!!!");
       }

       if(islightGreen){
           System.out.println("gogogo!!!");
       }
    }
}
