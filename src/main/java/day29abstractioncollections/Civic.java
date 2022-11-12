package day29abstractioncollections;
/*
"abstract methodlar sadece ne yapilacagini soyler(what to do)
"concrete methodlar ne yapilacagi ile birlikte nasil yapilacagini da soyler.

"interface"ler bir yapilacak isler listesidir.(To do list)

"multiple parent interface kullandiginizda ayni method ismiyle birden fazla method olusturursaniz bu
methodlarin return typelari ayni olmalidir.Aksi takdirde hata verir.
Çünkü java hangisini seçeceğini bilemez.  ==> void price();  ile   int price();  gibi

"interface"lerde constructor olmadigi icin interface'lerden obje olusturulamaz.
"abstract class"larda class olduklari icin constructor vardir.Ama constructor'lar abstract class
class'larda object olusturamazlar.
Javada interfacelerden(constructor yok çünkü) ve abstract class lardan object oluşturulamaz.

Soru:"Abstract Class" ile "Interface"in farklari nelerdir?
     1)Method
       "Abstract Class" hem abstract  hem de concrete methodlar icerebilir.
       "Interface"ler ise sadece abstract method'lar icerir.
       Ama istersek interface'ler icinde de 'default" ve "static" keyword'ler kullanilarak
       concrete method'lar olusturabiliriz.

     2)Variable
        "Abstract Class"larda normal Class'lardaki gibi her turlu variable olusturulabilir.
        "interface"lerde ise variable 'lar public  static ve final olmak zorundadir.

     3)Inheritance
        "Abstract Class"lar class olduklari icin multiple inheritance'a musaade etmezler.
        "Interface"ler ise multiple inheritance'i destekler.

     4)Object Creation
            "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar.
            "Interface" lerde ise constructor olmadigindan object olusturulamaz.

       Soru:Object Oriented Programming Language prensipleri nelerdir?
            i)Inheritance ii)Polymorphism iii)Encapsulation iv)Abstraction

 */

public class Civic implements Engine,Ac{
    @Override
    public void run() {
        System.out.println("Civic runs well");
    }



}
