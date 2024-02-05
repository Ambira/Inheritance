import Models.Employee;

public class NMain {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Deb", 17, "9867574843", "Baluwatar", "Art");

        employee1.getinfo();


        employee1.printSalary(2);
    }
}