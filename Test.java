import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*键盘录入一个字符串,
        要求1:长度为小于等于9
        要求2:只能是数字
                将内存变成罗马数字
        注意点:
        罗马数字里面是没有0
        如果键盘录入的数字包含0,可以变成""0(长度为0的字符串)   */

        //1,键盘录入
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个字符串");

            str = sc.next();

            //2.校验字符串是否满足规则
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("当前的字符串不符合规则.请重新输入");
                continue;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 48;
            String s = changeLuoMA(number);
            sb.append(s);

        }
        System.out.println(sb);


    }

    public static String changeLuoMA(int number) {
        // 罗马数字 1-9 的字符串数组
        String[] arr = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return arr[number];

    }

    public static boolean checkStr(String str) {
        //要求1:长度为小于等于9
        if (str.length() > 9) {
            return false;
        }
        //要求2:只能数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        //所有都完毕
        return true;
    }

}
