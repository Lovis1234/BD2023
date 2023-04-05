package nl.belastingdienst.H11;

import nl.belastingdienst.H10Inheritance.Human;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Pieter", 18);
        person.addHistory("Ja");
        person.printHistory();
        Human human = person.createSubHuman();
        System.out.println(human.greet());

    }
}
