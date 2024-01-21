package models;

public class Employee extends Person {
    private int id;
    private String name;
    private String surname;
    private String position;
    private double salary;

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    @Override
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {
        super();
    }

    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        this.position = position;
        this.salary= salary;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
