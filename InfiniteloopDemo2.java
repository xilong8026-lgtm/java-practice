import java.util.Random;

public class InfiniteloopDemo2 {
    static void main() {
        Random r = new Random();
        int number =r.nextInt(100) + 1;
        System.out.println(number);
    }
}
