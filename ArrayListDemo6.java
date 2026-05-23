import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("xilong001", "laowan", "123456");
        User u2 = new User("xilong002", "laosi", "1234563");
        User u3 = new User("xilong003", "laosan", "123qwe");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        int index = getIndex(list, "xilong003");


        System.out.println(index);


    }
    public static int getIndex(ArrayList<User> list ,String id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid =u.getId();
            if(uid.equals(id)){
                return i;
            }
        }
        return -1;
    }
}
