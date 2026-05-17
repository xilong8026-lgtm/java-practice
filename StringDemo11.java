public class StringDemo11 {
    public static void main(String[] args) {
        //1.获取到说的话
        String talk = "你玩的真好,以后别再玩了,求求你了,SB!";

        //2.定义一个铭感词库
        String[] arr = {"SB", "TMD", "MLGB","CNM"};

        //3.循环得到数组中的每一个敏感词,依次进行替换
        for (int i = 0; i < arr.length; i++) {
            talk =talk.replace(arr[i],"***");

        }
        System.out.println(talk);
    }
}
