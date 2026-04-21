package oop;

public class Librarian extends Person {

    public Librarian(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("Librarian: " + name + ", Age: " + age);
    }
}
