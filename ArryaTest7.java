public class ArryaTest7 {
    static void main() {
        int [] arr = {1,23,46,86,236};

        boolean flag = contains(arr,86);
        System.out.println(flag);

    }
    public static boolean contains(int[] arr, int number ) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
