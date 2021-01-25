package nl.novi.javaprogrammeren.two;

public class Dog extends Animal{
    private int numberOfLegs;
    private String name;

    public Dog(String name,int numberOfLegs) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getName() {
        return name;
    }

    @Override
    public void pet() {

    }
}
