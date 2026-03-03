package oop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Student("Matthew Pasaol", 20, "2026001", "BSIT"));
        people.add(new Student("John Cruz", 21, "2026002", "BSCS"));
        people.add(new Teacher("Mr. Santos", 40, "Object Oriented Programming"));

        for (Person p : people) {
            p.displayInfo();
        }
    }
}