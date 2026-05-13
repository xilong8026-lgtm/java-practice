public class GameTest {
    static void main() {
        //创建第一个角色
        role r1 = new role("小卡",100);
        //创建第二个角色
        role r2 = new role("阿卡",100);

        //开始格斗 回合制游戏
        while (true){
            //R1开始攻击R2
            r1.attack(r2);
            //判断r2攻击剩余血量
            if(r2.getBlood() == 0){
                System.out.println(r1.getName() + "K.O" + r2.getName());
                break;
            }
            //r2 开始攻击R1
            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName() + "K.O" +r1.getName());
                break;
            }



        }

    }
}
