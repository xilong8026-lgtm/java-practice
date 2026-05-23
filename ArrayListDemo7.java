import java.util.ArrayList;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        ArrayList<phone> list = new ArrayList<>();

        phone p1 = new phone("小米",1000);
        phone p2 = new phone("苹果",8000);
        phone p3 = new phone("垂直",2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<phone> phoneInfoList = getPhoneInfo(list);

        for (int i = 0; i < phoneInfoList.size(); i++) {
            phone phone = phoneInfoList.get(i);
            System.out.println(phone.getBrand() + ", " + phone.getPrice());

        }



    }

    //1.我要干什么? 查询手机信息
    //2.我干这件事情,需要什么才能完成?
    //3.我干完了,方法的调佣处是否需要继续使用结果?  返回

    //技巧:
    //如果我们要返回多个数据,可以把这些数据先放到一个容器当中,再把容器返回
    //集合 数组
    public static ArrayList<phone> getPhoneInfo(ArrayList<phone> list){
        //定义一个合集用于存储低于3000的手机对象
        ArrayList<phone> resultList = new ArrayList<>();
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            phone p = list.get(i);
            int price = p.getPrice();
            //如果当前手机的价格低于3000,那么就把手机对象添加到resultList中
            if(price < 3000){
                resultList.add(p);
            }
        }
        return resultList;
    }

}
