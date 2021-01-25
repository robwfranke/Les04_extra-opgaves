package nl.novi.javaprogrammeren.three;

public class MainThree {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setPhoneNumber("612345678");
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getInternationalPhoneNumber());

    }
}



// getter methode uit klasse Phone
