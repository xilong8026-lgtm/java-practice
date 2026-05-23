import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = rotate(str);
        System.out.println(result);

    }

    public static String rotate(String str) {
        char[] arr = str.toCharArray();
        Random ra = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = ra.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        String result = new String(arr);
        return result;
    }

}
        
