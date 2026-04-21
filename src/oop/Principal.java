package oop;

public class Principal extends Person {

    public Principal(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("Principal: " + name + ", Age: " + age);
    }
}
