public class Test1 {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6};

        // 顺序可以不同，只要偶数在前、奇数在后
        int[] result = separate(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }

    }

    public static int [] separate(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
}