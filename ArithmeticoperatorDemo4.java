package com.demo1;

public class ArithmeticoperatorDemo4 {
    static void main() {

        byte b1 = 100;
        byte b2 = 100;
        //现在我们要强转的是谁
        //B1+B2计算之后的结果
        //(byte)b1 + b2 强转的是b1,顶部是最终的结果
        byte result = (byte) (b1 + b2);
        System.out.println(result);

    }
}
