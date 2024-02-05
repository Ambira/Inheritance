package Models;

public class Employee extends Member {
    private String department;

    public Employee(String name, int age, String contact, String address, String department) {
        super(name, age, contact, address);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void getinfo() {
        System.out.println("Employee: " + getName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Age: " + getAge());
        System.out.println("Contact: " + getContact());
        System.out.println("Address: " + getAddress());
    }

}