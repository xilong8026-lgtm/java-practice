package com.demo3;

public class ForDemo7 {
    static void main() {
        int dividend = 100;
        int divisor = 10;
        int count = 0;
        while(dividend >= divisor){
            dividend = dividend - divisor;
            count++;
        }
        System.out.println(dividend);
        System.out.println(count);

    }
}
