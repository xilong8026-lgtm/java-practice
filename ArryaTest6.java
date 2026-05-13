public class ArryaTest6 {
    static void main() {
        int[] arr = {1, 2, 4, 6, 8, 15};
        int max = getMax(arr);
        System.out.println(max);

    }
    public static int getMax (int [] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max ){
                max = arr[i];
        }
    }
        return max;

    }
}
