package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {

        //Example: 3'den 6'ya kadar olan sayilarin toplamini bulan kodu yaziniz.

        int sum=0;
        for( int i=3; i<7; i++   ){sum=sum+i;}

        //Not:System.out.println(sum); Loop'un disina yazilirsa "sum"un sadece son degerini ekrana yazdirir.
        //System.out.println(sum); loop'un icine yazilirsa her bir lopp için "sum"in hangi degerlerini aldigini yazdirir.
        System.out.println(sum);//18

    //Example: 6'den 3'e kadar olan sayilarin carpimini bulan kodu yaziniz.

        int multiply=1;
        for( int i=6; i>2; i--   ){multiply=multiply*i;}
        System.out.println(multiply);
 //Example:Size verilen uc basamakli bir sayinin rakamlari toplamini bulunuz.


        int num=-385;
        num=Math.abs(num);
        int sonuc=0;
        for(int i=385; i>0; i=i/10){sonuc=sonuc+i%10;}
        System.out.println(sonuc);

    //Example:Size verilen  bir String'i ters ceviren kodu yaziniz.
        //        "Kaba==>abaK"

         String str="Kaba";
         String ters="";
    //Concatination yapacaksaniz "" kullaninniz.

    for(int i=str.length()-1; i>-1;i--){char c=str.charAt(i); ters=ters+c;}
        System.out.println(ters);












    }
}
