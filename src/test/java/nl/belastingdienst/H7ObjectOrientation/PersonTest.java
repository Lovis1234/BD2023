package nl.belastingdienst.H7ObjectOrientation;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testPerson() throws PersonDiedException {
        Person p = new Person("Jan", 129);
        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        System.out.println(p.getGender());
        p.haveBirthday();
        System.out.println(p.getAge());
        System.out.println(Person.universalRights());
        System.out.println(p);

    }

}