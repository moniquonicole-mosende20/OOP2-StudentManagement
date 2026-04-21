package oop;

public class Staff extends Person {

    public Staff(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("Staff: " + name + ", Age: " + age);
    }
}
