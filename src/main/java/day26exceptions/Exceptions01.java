package day26exceptions;

public class Exceptions01 {
    public static void main(String[] args) {

        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5);//128

        String st = "1a2b";
        int r = convertStringToInteger(st);//NumberFormatException:Eger icinde rakamdan farkli karakter barindiran bir String'i
                                           //ValueOf() kullanarak Integer'a cevirmek isterseniz NumberFormatException alirsiniz.
        System.out.println(r + 10);

    }

    public static int convertStringToInteger(String str) {
        int i=0;
        try {
            //Herhangi bir satirda "Exception" atilirsa java direkt "catch" bolumune gecer
            //try icindeki sonraki kodlari calistirmaz.

           i= Integer.valueOf(str);
            System.out.println("burasi try bolumu");

        }catch(NumberFormatException e){
            System.out.println("Rakam olmayan karakter iceren String'ler Intrger'a cevrilemez.");
        }
        return i;
    }
}