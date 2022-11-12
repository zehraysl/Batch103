package day29abstractioncollections;

public interface Engine extends Vehicle {
    //Child     Parent
    //Class--->Interface ==>implement
    //Class--->Class ==>extends
    //Interface--->Interface ==>extends
    //Interface--->Class ==>Mumkun degil

    //interface'deki tum variable'ler otomatik olarak(default) "public"dir.
    //interface'deki tum variable'ler otomatik olarak(default) "final"dir.
    //interface'deki tum variable'ler otomatik olarak(default) "static"dir.

    int price=2000;
    double weight=23.5;
    void run();
}
