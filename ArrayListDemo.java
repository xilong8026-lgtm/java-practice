import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<String> list = new ArrayList<>();

        //添加元素
        list.add("aaa");
        list.add("aaa");
        list.add("ddd");
        list.add("ccc");

        //删除元素
        /*boolean result1 = list.remove("aaa");
        System.out.println(result1);

        boolean result2 = list.remove("bbb");
        System.out.println(result2);

        String str = list.remove(2);
        System.out.println(str);

        //修改元素
        String r = list.set(1, "rrr");
        System.out.println(r);*/

        //遍历
        for (int i = 0; i < list.size(); i++) {
            //i 索引
            //list.get(i)元素
            String str = list.get(i);
            System.out.println(str);

        }

    }
}
