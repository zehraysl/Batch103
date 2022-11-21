package day32maps;

import java.util.Hashtable;

public class HashTable01 {
    /*
    1)HashTable bir map'tir.
    2)HashTable entrySet'leri herhangi bir siralamaya tabi tutmaz.
    3)HashTable ,HashMap'lerden daha yavastir. Cunku HashTable'lar tread-safe ve synchronized'dir.
    (aynı andan birden fazla iş yapabilme becerisi) ve synhronize'dir(çoklu işlerin zaman kazandıracak şekilde sıralanabilmesidir.)
   4)HashTable'larda key null olamaz. Key'i null yaparsanız NullPointerException atar.
   5)HashTable'larda value null olamaz. Value'yu null yaparsanız NullPointerException atar.
Note: toString() method'u object'leri console'da detayları ile görebilmek için class'ların içinde oluşturulur.
      toString() method'unu oluşturmadan object'i console'a yazdırırsanız Java o object'in adresini yazdırır.




INTERWIEW QUESTIONS
                  MAP'LER ARASINDAKI FARKLAR
1) HashMap ve TreeMap ve LinkedHashMap  synchronized ve thread-safe degildir.
    HashTable synchronized ve thread-safe dir.

    2) Treemap'ler natürel order yapar.
     LinkedHashMap giriş sırasına göre listeler.
     HashMap ve Hashtable sıralama yapmaz,rastgele sıralar.

    3) HashMap ve LinkedHashMap'lerde hem key hemde value için null değeri kullanılabilir.
     TreeMap'lerde key'ler icin "null" kullanılmaz.
     HashTable larda ikisi içinde null kullanılmaz.


*/





    public static  void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey", 90000000);
        System.out.println(countryPopulations);// {USA=400000000, Germany=83000000, Turkey=90000000}

        //countryPopulations.put(null, 90000000);// HashTable'larda key null olamaz. NullPointerException
        //countryPopulations.put("France", null);// HashTable'larda value null olamaz. NullPointerException


        Hashtable<String, Students> myStudents = new Hashtable();
        myStudents.put("Math",new Students("Tom Hanks","th@gmail.com",21,true));
        myStudents.put("Science",new Students("Mary Star","ms@gmail.com",34,false));

        System.out.println(myStudents);

        String name=myStudents.get("Math").name;
        System.out.println(name);

        int age= myStudents.get("Math").age;
        System.out.println(age);
    }
}
