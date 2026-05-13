import java.util.Random;

public class ArryaTest3 {
    static void main() {
        int[] arr = new int [10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("求和"+ sum);

        int avg =sum / arr.length;
        System.out.println("平均数"+ avg);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                count++;
            }
        }
        System.out.println("在数组中,一共有" + count + "个数据,比平均数小");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    }
