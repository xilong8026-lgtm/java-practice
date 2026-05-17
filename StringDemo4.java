import java.util.Scanner;

public class StringDemo4 {
    static void main(String[] args) {
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        String sut = sc.next();
        System.out.println("请输入一串字符");
        //2.进行遍历
        for (int i = 0; i < sut.length(); i++) {
            //依次表示字符串的每一个索引
            char c = sut.charAt(i);
            System.out.println(c);

        }
    }
}
