public class GirlFriendTest {
    static void main() {
        GirlFriend[] arr = new GirlFriend[4];

        GirlFriend gf1 = new GirlFriend("小鱼",18,"妹子","玩游戏");
        GirlFriend gf2 = new GirlFriend("小啊",20,"妹子","吃饭");
        GirlFriend gf3 = new GirlFriend("小如",28,"妹子","打飞机");
        GirlFriend gf4 = new GirlFriend("小菜",21,"妹子","爱爱");

        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //i 索引 arr[i] 元素 (女朋友对象)
            GirlFriend gf = arr[i];

            sum = sum + gf.getAge();
        }
        int ave = sum / arr.length;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if(gf.getAge() < ave){
                count++;
                System.out.println(gf.getName()+", "+gf.getAge()+", "+gf.getGender()+", "+gf.getHobby());

            }
        }
        System.out.println(count + "个");

    }
}
