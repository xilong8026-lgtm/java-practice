import java.util.Scanner;

public class Test {
    static void main() {
        //1键盘录入机票原价,月份,头等舱或经济舱

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前的月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位 0 头等舱 1 经济舱");
        int seat = sc.nextInt();

        //2先判断月份是旺季还是淡季
        if(month >= 5 && month <= 10 ){
            ticket = getTicket(seat, ticket, 0.9, 0.85);
        }else if((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            ticket = getTicket(seat, ticket, 0.7, 0.65);
        }else{
            System.out.println("键盘录入的月份不合法");
        }
        System.out.println(ticket);
        }

    private static int getTicket(int seat, int ticket, double x, double x1) {
        //旺季 //3继续判断当前机票是经济舱还是头等舱
        if (seat == 0) {
            //经济舱
            ticket = (int) (ticket * x);
        } else if (seat == 1) {
            //头等舱
            ticket = (int) (ticket * x1);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }
    //4根据实际情况计算出对应的价格


    }

