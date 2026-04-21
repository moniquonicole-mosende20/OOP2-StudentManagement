public class Staff extends Person {
    private String department;
    private String position;

    public Staff() {}

    public Staff(String name, int age, String department, String position) {
        super(name, age);
        this.department = department;
        this.position = position;
    }

    @Override
    public void displayInfo() {
        System.out.println("Staff Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
        System.out.println("---------------------");
    }
}
