import java.util.Scanner;

public class Test3 {
    static void main() {
        //在唱歌比赛中,有6名评委给选手打分,分数范围,[0~100]之间的整数.
        //选手的最后得分为,渠道最高分,最低分后的4个评委的平均分,请完成上述过程并算出选手得分


        //分析
        //1.定义一个数组,用来存储6名评委额打分(0~100)
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        //2.求出数组中的最大值
        int max = getMax(scoreArr);

        //3.求出数组中的最小值
        int min = getMin(scoreArr);

        //4.求出数组中的6个分数的总和
        int sum = getSum(scoreArr);

        //5.(总和 - 最大值 - 最小值) / (数组长度 - 2)
        int avg = (sum - max - min)/(scoreArr.length - 2);
        System.out.println("总分" + avg);


    }
    public static int getSum(int[] scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
             sum =sum + scoreArr[i];
        }
        return sum;
    }

    public static int getMax(int[] scoreArr){
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] > max){
                max = scoreArr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] scoreArr){
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] < min){
                min = scoreArr[i];
            }
        }
        return min;
    }
    //我要干什么,定义一个数组,用来存储6名评委额打分(0~100)
    //我需要干什么? 都不需要
    //干完了这件事情,是否需要返回? 必须返回
    public static int[] getScores(){
        //定义数组
        int[] scores = new int[6];
        //使用键盘录入的形式,输入分数:0~100
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){
                scores[i] = score;
                i++;
            }else {
                System.out.println("无效成绩" + i);
            }

        }
        return scores;
    }

}
