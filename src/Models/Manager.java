package Models;

public class Manager extends Member {
    private String specialization;

    public Manager(String name, int age, String contact, String address, String specialization) {
        super(name, age, contact, address);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

