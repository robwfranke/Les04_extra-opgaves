package nl.novi.javaprogrammeren.three;

public class Beer {
    private String brand;
    static int numberOfBeers=0;

    public Beer(String brand) {
        this.brand = brand;
        numberOfBeers++;
        System.out.println("Dit is biertje nummer:" + numberOfBeers);
    }
}




//package nl.novi.javaprogrammeren.three;
//
//public class Beer {
//    private String brand;
//
//    public Beer(String brand) {
//        this.brand = brand;
//    }
//}
