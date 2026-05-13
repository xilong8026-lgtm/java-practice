package com.demo3;

public class ForDemo2 {
    static void main() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            //System.out.println(i);
            if (i % 2 == 0){
                sum = sum + i;

            }
        }
        System.out.println(sum);
    }
}
