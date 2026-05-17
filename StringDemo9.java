public class StringDemo9 {
    public static void main(String[] args) {
        //1.获取一个手机号码
        String phoneNumber = "13139983845";

        //2.截取手机号码前面3位
        String start = phoneNumber.substring(0, 3);

        //3.截取手机号码后面的四位数
        String end = phoneNumber.substring(7);

        //4.拼接
        String result = start + "****" + end;

        //5.打印
        System.out.println(result);

    }
}
