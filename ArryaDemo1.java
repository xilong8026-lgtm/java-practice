public class ArryaDemo1 {
    static void main() {
        //利用索引对数组中的元素进行访问
        //1.获取数组里面的元素
        //格式 :数组名[索引]

        int[] arr = {1,2,3,4,5};
        //获取数组中的第一个元素
        //其实就是0索引上对应的元素
        int number = arr[0];
        System.out.println(number);//1

        //获取数组中1索引对应的数据,冰直接打印
        System.out.println(arr[1]);

        //2.把数据存储到数组当中
        //格式:  数组名[索引] = 具体数字/变量

        arr[0] = 100;
        System.out.println(arr[0]);

    }
}
