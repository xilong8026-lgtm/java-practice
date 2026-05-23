import java.util.Scanner;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //使用StringBuilder的场景
        //1.字符串的拼接
        //2.字符串的反转

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        String result = new StringBuilder().append(str).reverse().toString();

        if(str.equals(result)){
            System.out.println("当前字符串是对称字符串");
        }else{
            System.out.println("当前字符串不是对称字符串");
        }

    }
}
