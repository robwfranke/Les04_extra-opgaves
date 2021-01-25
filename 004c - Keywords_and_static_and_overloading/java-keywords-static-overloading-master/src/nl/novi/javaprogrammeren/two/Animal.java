package nl.novi.javaprogrammeren.two;

public  abstract class Animal {

    private int amountOfLegs;
    private String name;


    public abstract void pet();

}



// Animal final uit class gehaald.
// omdat pet() hier abstract gemaakt is, moet je Animal abstact zijn en moet je deze in dog overriden
