//package nl.novi.javaprogrammeren.two;
//
//import nl.novi.javaprogrammeren.two.sub.Phone;
//
//public class MainTwo {
//    public static void main(String[] args) {
//        Phone phone = new Phone("Nokia");
//    }
//}


// methode 1, maak de getter public, dan werkt het ook buiten zn package




package nl.novi.javaprogrammeren.two;

        import nl.novi.javaprogrammeren.two.sub.Phone;

public class MainTwo {
    public static void main(String[] args) {



        Phone phone = new Phone("Nokia");
        System.out.println(phone.getBrand());

    }
}