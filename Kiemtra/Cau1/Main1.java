package Kiemtra.Cau1;

public class Main1 {
    public static void main(String[] args) {
        Circle t1 = new Circle();
        System.out.println(t1);
        System.out.println("Chu vi hình tròn là:"+t1.getArea());
        System.out.println("Diện tích hình tròn là: "+t1.getCircumference());

        Circle t2 = new Circle(5);
        System.out.println(t2);
        System.out.println("Chu vi hình tròn là:"+t2.getArea());
        System.out.println("Diện tích hình tròn là: "+t2.getCircumference());

        // Kiểm tra với những Circle có r < 0 => exception Error
        System.out.println("\nTest với điều kiện Error:");
        try{
            Circle t3 = new Circle(-1);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
