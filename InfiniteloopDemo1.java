import java.util.Scanner;

public class InfiniteloopDemo1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i * i == number) {
                System.out.println(i + "就是" + number + "平方根");
                break;
            }else if(i * i > number){
                System.out.println((i - 1) + "就是" + number + "平方根的整数");
                break;
            }
        }
    }
}