package nl.novi.javaprogrammeren.three;

import nl.novi.javaprogrammeren.three.sub.Human;

public class Doctor extends Human {

    private String sofiNumber;

    public Doctor(String sofiNumber) {
        super(sofiNumber);/*gebruik nu structuur van human*/
        this.sofiNumber=sofiNumber;
//        System.out.println(sofiNumber);
    }



    public String getSofinumber() {
        return sofiNumber;
    }
}




//public class Doctor extends Human {
//
//    private String name;
//    private String sofiNumber;
//
//    public Doctor(String name) {
////        super(sofiNumber);
//        this.name = name;
//        this.sofiNumber=getSofiNumber();
//    }
//}
