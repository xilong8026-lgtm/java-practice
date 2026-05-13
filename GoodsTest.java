public class GoodsTest {
    static void main() {
        Goods[] arr = new Goods[3];

        Goods g1 = new Goods("001","华为040",3999.0,90);
        Goods g2 = new Goods("002","保温杯",499.0,50);
        Goods g3 = new Goods("003","老鹰茶",19.0,210);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getCount() + " ," + goods.getPrice());
        }

    }
}
