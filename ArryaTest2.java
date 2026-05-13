public class ArryaTest2 {
    static void main() {
        int[] arr = {22,33,44,5,66};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max){
                max = arr[i] ;
            }

        }
        System.out.println(max);
   }
}
