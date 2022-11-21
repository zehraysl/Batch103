package day32maps;

public class StaticBloks01 {

    static{
        System.out.println("static block 2");
    }
    public static void main(String[] args) {
        System.out.println("main method");
    }
    public static double pi;
    //static block'lar ihtiyacımız olan variable'ların class oluşturma safhasında elimizde olmasını sağlar.
    //static block'lar Class içindeki her şeyden önce çalıştırılır. "main method" dan ve diğer tüm method'lardan önce çalıştırılır.
    //static block'lar içinde sadece "static variable" lara değer atanabilir.
    //birden fazla static block varsa ustteki once calistirilir.


    static {
        pi=3.14;
        System.out.println("Static block 1");
    }





}
