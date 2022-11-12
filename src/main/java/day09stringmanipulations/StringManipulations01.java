package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01  { public static void main(String[] args) {

    String str="Kara kara dusunme Ankara";
    int idxA1= str.indexOf("kara");
    System.out.println(idxA1);
    //indexOf() method'u- verilen karakterlerin ilk gorunumunun indexini verir.

    //LastindexOf methodu verilen karakter veya karakterlerin son gorunumunun indexini verir.
    int idxA2=str.lastIndexOf("kara");
    System.out.println(idxA2);

    String s="Mississippi";
    int idxI=s.indexOf('i');//indexOf() hem String hen de char ile kullanilabilir.

    System.out.println("idxI = " + idxI);

    int idxIss1= s.indexOf("iss");//Ilk gorunumun ilk karakterinin indexini verir.
    System.out.println("idxIss1 = " + idxIss1);
    int idxIss2= s.lastIndexOf("iss");//Son gorunumun ilk karakterini verir.
    System.out.println("idxIss2 = " + idxIss2);

    //Example 1:Bir String'deki bir karakterin tekrarli veya tekrarsiz olup olmadigini gosteren kodu
    //yazininiz.
    //  "Helloooo"==>H-->Tekrarsiz e-->tekrarsiz l-->tekrarli o-->tekrarli

    String t="helloooo";
    char c='e';
    if(t.indexOf(c)==t.lastIndexOf(c)){
        System.out.println("tekrarsiz");

    }else{
        System.out.println("tekrarli");
    }

    //  t.indexOf(c)==t.lastIndexOf(c) ? "tekrarsiz":"tekrarli";

    String u="Learn Java earn money";

    int sonuc=     u.indexOf("e",4);//11
    System.out.println("sonuc = " + sonuc);
    // indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar karakteri
    //gectikten sonra istenen karakterin ilk gorunumunun index'ini return eder.,

   //lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi index olarak kabule edip en bastan
   // bu indexe kadar olan karakterleri bir kutu icine aliniz ve lastIndexOf() method'unu sadece bu kutu icindeki String icin kullaniniz.

    String m= "Hello everyone!";
    int e=m.lastIndexOf("e",10);
    System.out.println("e = " + e);


    String v="";
    boolean bosMu= v.isEmpty();
    System.out.println("bosMu = " + bosMu);
    //isEmpty() merthodu bir string'in bos olup olmadigini kontrol eder
    //eger string'de hic karakter yoksa isEmpty() true return eder,her hangi bir karakter varsa
    //false return eder.
    //length()==0 demek isEmpty()true verir demektir.
    //Bir String'in bos olup olmadigini anlamak icin length()==0 kullanmayin,isEmpty kullanin.

    String x=" ";
    boolean blankMi=x.isBlank();
    System.out.println("blankMi = " + blankMi);//true
    //isBlank() hem bos String icin hem de sadece space iceren String'ler icin true return eder.

// Example 2: Kullanicidan alinan isim mutlaka spacve den farkli en az 1 karakter icermelidir.
    Scanner input=new Scanner(System.in);
    System.out.println("Ilk isminizi giriniz");
    String ilk=input.nextLine();
    if(ilk.isBlank()){
        System.out.println("Sana ismini gir dedim..");

    }else {
        System.out.println(ilk);}}}




