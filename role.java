import javax.management.relation.Role;
import java.util.Random;

public class role {
    private String name;
    private int blood;

    public role() {
    }

    public role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
    //定义一个方法用攻击别人
    //思考: 谁攻击谁?
    //Role r1 = new Role();
    //Role r2 = new Role();
    //r1 攻击R2
    //方法的调用者去攻击参数
    public void attack(role role){
        //造成的伤害 1 ~ 20
        Random r = new Random();
        int hurt = r.nextInt(20)+1;
        //修改挨揍的血量
        int remainBoold = role.getBlood() - hurt;
        //对剩余血量做个验证,如果为负数了,就修改为0;
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        //修改一下挨揍的人的血量
        role.setBlood(remainBoold);


        System.out.println(this.getName() + "用石头,砸了打了" + role.getName() +
                "一下,造成了" + hurt + "点伤害" +  role.getName() +"还剩" + remainBoold + "点血量");
    }


}

