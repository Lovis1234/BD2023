package nl.belastingdienst.H11;

import nl.belastingdienst.H10Inheritance.Gender;
import nl.belastingdienst.H10Inheritance.Human;
import nl.belastingdienst.H10Inheritance.PersonDiedException;

import java.util.Objects;

public class Person extends Human {
    private String name;
    private int age;
    private Gender gender = Gender.UNKNOWN;
    private static final int maximumAge = 129;
    private HistoryRecord[] historyRecords = new HistoryRecord[25];
    private int historyIndex;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human createSubHuman() {
        Human human = new Human() {
            @Override
            public String greet() {
                return "Sub is the best.";
            }
        };
        return human;
    }

    public void haveBirthday() throws PersonDiedException {
        if (age < maximumAge) {
            age++;
        } else throw new PersonDiedException();
    }

    public void addHistory(String descr) {
        this.historyRecords[historyIndex++] = new HistoryRecord(descr);
    }

    public void printHistory() {
        for (int i = 0; i < historyIndex; i++) {
            System.out.println(historyRecords[i]);
        }
    }

    static class HistoryRecord {
        String description;

        public HistoryRecord(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
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

    @Override
    public String greet() {
        return "Hello, my name is " + name + ". Nice to meet you!";
    }
}
