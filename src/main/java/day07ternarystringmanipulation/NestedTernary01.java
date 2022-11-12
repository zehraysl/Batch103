package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
        Verilen yilin " Leap Year" olup olmadigini kontrol eden kodu yaziniz.
        i)Yil 100'e bolunurse 400'e de bolunmelidir.
        ii)yil 100'e bolunmezse 4'e bolunmelidir.
         */

        int year = 1600;

      String leap=  year%100==0 ? (year%400==0 ? "Leap Year":"Leap year degil"):(year%4==0 ?"Leap Year":"Leap year degil" );

      System.out.println( leap);
      /*
      Asagidaki kurallara gore password'un gecerli olup olmadigini kontrol eden kodu yaziniz.
      i)Sekiz karakterden fazla veya sekiz karakter varsa ilk harfi 'i' olmalidir.
      ii)Sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir.

       */
        String pwd="i2a3ed54";
        char ilkHarf=pwd.charAt(0);
        String gecerli=pwd.length()<8 ? (ilkHarf=='K' ? "Gecerli":"Gecersiz"):(ilkHarf=='i'? "Gecerli":"Gecersiz");
        System.out.println(gecerli);







    }
}
