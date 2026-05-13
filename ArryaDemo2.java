public class ArryaDemo2 {
    static void main() {
        //1定义数字
        int[] arr = {1,2,3,4,5};
        //2获取数组里面所有的元素
        //格式:  数组名[索引]

        //利用循环改代码
        //开始条件:0
        //结束条件: 数组的长度- 1(最大索引)
        /*for(int i = 0; i < 5 ; i++){
            //i: 0 1 2 3 4 5
            System.out.println(arr[i]);
            }*/

        //在java中,关于数组的一个长度属性,length
        //调用方式.数组名.lingth

        //System.out.println(arr.length);
        for(int i = 0; i < arr.length ; i++)
            System.out.println(arr[i]);

        //扩展:
        //自动的快速生成数组的遍历方式
        //idea提供的
        //数组名.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            
        }
    }
}
