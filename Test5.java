import java.util.Random;

public class Test5 {
    static void main() {
        int[] arr = {2, 588, 888, 1000, 100};

        int[] newArr = new int[arr.length];

        Random r = new Random();
        for (int i = 0; i < newArr.length; ) {
             int randomIndex = r.nextInt(arr.length);
             int prize = arr[randomIndex];
             boolean flag = contains(newArr, prize);
             if(!flag){
                 newArr[i] = prize;
                 i++;
             }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
    public static boolean contains(int[]arr,int prize){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == prize){
                return true;
            }
        }
        return false;
    }
}
