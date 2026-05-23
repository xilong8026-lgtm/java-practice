import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("无语");
        list.add("无聊");
        list.add("物流");
        list.add("未来");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");


    }
}
