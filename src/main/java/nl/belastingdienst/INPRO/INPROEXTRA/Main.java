package nl.belastingdienst.INPRO.INPROEXTRA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Pieter"),new Person("Klaas"),new Person("Sjoerd"), new Person("Jantje"), new Person("Henk"));
        List<Date> dateList = new ArrayList<>();
        int count = 0;
        int count2 = 0;
        for (Person person : personList){
            if (dateList.isEmpty()){
                dateList.add(new Date(person));
            } else if (dateList.get(count).person1 == null) {
                dateList.get(count).person1 = person;
            } else if (dateList.get(count).person2 == null) {
                dateList.get(count).person2 = person;
                dateList.add(new Date());
                count++;
            }
            }

        for (Date date : dateList){
            if (date.person1 == null) {
            } else if (date.person2 == null){
                System.out.println(date.person1.name + " heeft geen match");
            } else { System.out.println(date.person1.name + " " + date.person2.name);}
        }


    }
}