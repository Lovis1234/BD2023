package nl.belastingdienst.H10Inheritance;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Pieter", 12);
        Android android = new Android();
        Employee employee = new Employee("Peebe", 19);
        Teacher teacher = new Teacher("Peebe", 19);
        System.out.println(person.greet());
        android.charge(100);
        System.out.println(android.greet());
        System.out.println(employee.greet());
        System.out.println(teacher.greet());


    }
}
