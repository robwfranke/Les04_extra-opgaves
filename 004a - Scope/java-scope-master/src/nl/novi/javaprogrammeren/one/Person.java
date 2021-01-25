//package nl.novi.javaprogrammeren.one;
//
//public class Person {
//
//    private String name;
//
//    public Person(String name) {
//        this.name = name;
//    }git commit "begin"
//
//    public void setAge(int age) {
//        age = age;
//    }
//}
// toegevoegd opgave public void ageOneYear() etc

//daarna private int age;
//



package nl.novi.javaprogrammeren.one;

public class Person {

    private String name;
    private int age;


    public Person(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void ageOneYear(){
        this.age++;
    }
}