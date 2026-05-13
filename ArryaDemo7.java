public class ArryaDemo7 {
    static void main() {
        double area1 = getArea(2.5,5.3);
        double area2 = getArea(4.2,4.6);

        if (area1 > area2){
            System.out.println("第一个长方形大");
        }else {
            System.out.println("第二个长方形大");
        }

    }
    public static  double getArea(double len,double width){
        double area = len * width;
        return area;
    }

}
