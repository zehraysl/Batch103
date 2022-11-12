package day04ifstatement;


        import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        /*
                Kullanıcıdan ilk, orta ve soyismin kimlik numarasını alınız ve aşağıdaki formatta ekrana yazdırınız.
                Ali Mert Can
                123456789
         */
        Scanner input = new Scanner(System.in);

        //1. Yol:
//        System.out.println("İlk isminizi giriniz...");
//        String ilkIsim = input.next();// next() methodu kullanıcıdan String data'sı almak için kullanılır.
//
//        System.out.println("Orta isminizi giriniz...");
//        String ortaIsim = input.next();
//
//        System.out.println("Soy isminizi giriniz...");
//        String SoyIsim = input.next();
//
//        System.out.println("Kimlik numaranızı giriniz...");
//        String kimlikNo = input.next();
//
//        System.out.println(ilkIsim + " " + ortaIsim + " " + SoyIsim);
//        System.out.println(kimlikNo);

        //2. Yol:
        System.out.println("İlk, orta, soy isminizi ve kimlik numaranızı giriniz...");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilk + " " + orta + " " + soy);
        System.out.println(kimlik);

        //3. Yol:
        System.out.println("Ilk, orta ve soy isminizi giriniz.");
        String tamIsim =input.nextLine();
        System.out.println("Kimlik numarasi giriniz:");
        String kimlikNumarasi=input.next();
        System.out.println(kimlikNumarasi);


    }

}