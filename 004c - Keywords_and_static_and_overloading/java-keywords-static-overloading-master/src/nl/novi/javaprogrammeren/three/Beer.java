package nl.novi.javaprogrammeren.three;

public class Beer {
    private String brand;
    static int tappedBeersAmount=0;
    private int amountOfBeersTapped=0;

    public Beer(String brand) {
        this.brand = brand;
        tappedBeersAmount++;
        System.out.println("Dit is biertje nummer:" + tappedBeersAmount);
        if (brand.equals("Heineken")){
            amountOfBeersTapped++;
        }

    }


    public static int getTappedBeersAmount() {
        return tappedBeersAmount;
    }

    public int getAmountOfBeersTapped() {
        return amountOfBeersTapped;
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
