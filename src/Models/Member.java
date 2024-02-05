package Models;

public class Member {
    private String name;
    private int age;
    private String contact;
    private String address;

    // Constructor
    public Member(String name, int age, String contact, String address) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.address = address;
    }


    public void printSalary(int leaves) {
        int workingDays = 24;
        double salaryPerDay = 1000.0;
        double salary = salaryPerDay * (workingDays - leaves);
        System.out.println("Salary: " + salary);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
