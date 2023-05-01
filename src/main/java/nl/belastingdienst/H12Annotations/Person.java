package nl.belastingdienst.H12Annotations;

import nl.belastingdienst.H7ObjectOrientation.Gender;
import nl.belastingdienst.H7ObjectOrientation.PersonDiedException;

import java.util.Objects;
@MyAnnotation
public class Person {
    private String name;
    private int age;
    private Gender gender = Gender.UNKNOWN;
    private static final int maximumAge = 129;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void haveBirthday() throws PersonDiedException {
        if (age < maximumAge) {
            age++;
        } else throw new PersonDiedException();
    }

    public static String universalRights() {
        return "All humans are created equal.";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean equals(Person p) {
        return age == p.age && Objects.equals(name, p.name) && gender == p.gender;
    }


    public int hashCode() {
        return age * name.hashCode() * gender.hashCode();
    }

    @Override
    public String toString() {
        return name + " (" + age + ") is " + gender;
    }
}
