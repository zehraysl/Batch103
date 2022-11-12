package day28abstraction;

public abstract class Animal {
    //body'si olmayan methodlar abstract method olarak adlandirilir.
    //Bir methodu abstract yapmak icin: 1)Method bodyi sil 2)"abstract" keyword kullanilir.
    //"abstract method" lar "abstract class" icinde olmalidir.
    public abstract void eat();


    //"abstract class" larda hem "abstract" hem de "concrete"(non-abstract) method kullanilabilir.
    public void drink(){
        System.out.println("Animals drink");
    }


    //abstract "move" method olusturunuz
    public abstract void move();
}
