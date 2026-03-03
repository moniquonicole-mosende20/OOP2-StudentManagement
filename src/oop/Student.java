package oop;

class Student extends Person {
    private String studentId;
    private String course;

    public Student() {}

    public Student(String name, int age, String studentId, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("---------------------");
    }
}