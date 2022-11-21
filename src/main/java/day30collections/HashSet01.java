package day30collections;

import java.util.HashSet;

public class HashSet01 {
    /*
    Hash bir tekniktir,birbirine benzemeyen code'lar üretir bu code'lar data'yı unique yapar.
    Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)

    HashSet'ler eklenen elemanların sıralaması ile uğraşmaz. Sıralama ile alakalı zaman harcamaz bu yüzden çok hızlı çalışır.
    HashSet'ler index kullanmazlar. Cunku siralama rastgele yapildigi icin index manali olmaz.

         HashSetler:
            1)Tekrarsiz elemanlarda
            2)Sıralama onemli degilse
            3)Hız cok önemliyse
            4)Indeks kullanmazlar
 */
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<String>();

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        //Var olan elemanı eklerseniz hata vermez, son ekleneni var olan data'nın üstüne yazar.
        emails.add("Mango");
        System.out.println(emails);// [Apple, Fig, Mango, Apricot, Orange]

        emails.add("Mango");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]/
    }
}
