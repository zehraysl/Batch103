package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Tacettin");

        System.out.println(names);//[Tom, Thomas, Tahsin, Trump, Tacettin]

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Tacettin");

        names.removeAll(cities);//removeAll() kullandiginizda sadece ilk list degisir, parantezin icindeki list degismez
        System.out.println(names);//[Thomas, Tahsin]
        System.out.println(cities);//[Trump, Tom, Tacettin]

        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");


        boolean sonuc1 = names.containsAll(myNames);//Bie List'in icinde coklu elemanlarin var olup olmadigini kontrol eder.
        //Hepsi varsa true en az biri yoksa false verir.
        System.out.println(sonuc1);

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        //Ex 1:a List'inde "Shoes" elemaninin ilk gorunumunu siliniz.
        a.remove("Shoes");
        System.out.println(a);

        //Ex 2:a List'inde "Shoes" elemaninin tum gorunumlerini siliniz.
        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");
        a.removeAll(silinecekler);
        System.out.println(a);

        //Ex 3:Bir tane salary list olusturun.Eger salary 10000den az ise %20,
        //10000 ve 10000den cok ise %10 zam yapiniz.
        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);
        for (Double w : salary) {
            if (w < 10000) {
                salary.set(salary.indexOf(w), w * 1.2);
            } else {
                salary.set(salary.indexOf(w), w * 1.1);
            }
        }
        System.out.println(salary);

        //Ex 4: Iki ArrayList'in esit olup olmadigini kontrol eden kodu yaziniz.
        //2 arraylistin esit olabilmesi icin elemanlar esit olami ve ayni elemanlar ayni indexte olmali.

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('z');
        m.add('y');
        m.add('t');


        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.yol:
        int counter = 0;//Flag

        for(int i=0; i<m.size(); i++){
            if(m.size()!=n.size()){
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }else if(m.get(i) != n.get(i)){
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }
        }
        if(counter==0){
            System.out.println("Listler esittir");
        }
 // 2.yol:
        boolean esitMi=m.equals(n);
        if(esitMi){
            System.out.println("Listler esittir");
        }else{
            System.out.println("Listler esit degildir");
        }
















    }}

