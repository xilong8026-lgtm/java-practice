import java.util.Random;
import java.util.Scanner;

public class Test6 {
    static void main() {
        //生成中奖号码
        int[] arr = createNumber();

        System.out.println("==============================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("==============================");

        //2用户输入彩票号码
        int[] userInputArr = userInputNumber();

        int redCount = 0;
        int blueCount = 0;

        for (int i = 0; i < 6; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (redNumber == arr[j]) {
                    redCount++;
                    break;
                }
            }
        }

        int blueNumber = userInputArr[userInputArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }
       //根据球的个数 判断中奖情况
        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜1000万");
        }else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜500万");
        }else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜3000");
        }else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜200");
        }else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜10");
        }else if ((redCount == 2 && blueCount == 0) || (redCount == 1 && blueCount == 0)||(redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜5");
        }else{
            System.out.println("谢谢惠顾");
        }

    }




    public static int[] userInputNumber(){
        //1创建数组用于添加用户买的彩票号码
        //6个红球 1个篮球 数组长度:7
        int[] arr = new int[7];

        //2.键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
            if(redNumber >= 1 && redNumber <= 33){
                boolean flag = contains(arr,redNumber);
                if(!flag){
                    arr[i] = redNumber;
                    i++;
                }else{
                        System.out.println("写错了滚回去重写");
                }
                }else{
                    System.out.println("超出范围");
            }
        }

        //用户去输入蓝球号码
        while (true) {
            System.out.println("请输入篮球号码");
            int blueNumber = sc.nextInt();
            if(blueNumber >= 1 && blueNumber <= 16){
                arr[arr.length - 1] = blueNumber;
                break;
            }else{
                System.out.println("篮球范围超了");
            }
        }
        return arr;


    }


    public static int[] createNumber() {
        //1创建数组用于添加中奖号码
        //6个红球 1个篮球 数组长度:7
        int[] arr = new int[7];

        //2随机生成号码并添加到数组当中
        //红球:不能重复的 1 2 3 4 5 6
        //篮球: 可以跟红球号码重复 5

        //生成红球号码并添加到数组当中
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            //获取红球号码
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                //把红球号码添加到数组当中
                arr[i] = redNumber;
                i++;
            }
        }
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

        //用于判断数组在数组中是否存在
        public static boolean contains ( int[] arr, int number){
            for (int i = 0; i < 6; i++) {
                if (arr[i] == number) {
                    return true;

                }
            }
            return false;

        }
}