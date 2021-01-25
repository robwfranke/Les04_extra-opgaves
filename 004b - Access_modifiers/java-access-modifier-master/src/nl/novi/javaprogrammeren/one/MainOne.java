package nl.novi.javaprogrammeren.one;

public class MainOne {
    public static void main(String[] args) {

        Person sjaak = new Person("Sjaak");
//        System.out.println(sjaak.getName());
        System.out.println(sjaak.name);


    }
}


// 1.Person heeft geen getter public, maar private. dus verander getter in public
// je kunt ook de naam in person public maken, dan hoef je de getter niet te gebruiken
//derde manier??