package models;

public class Student extends Person {
    private int id;
    private String name;
    private String surname;
    private double gpa;
    final double salary = 36660.0;
    final double gpaForSalary = 2.67;

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa){
        super(name, surname);
        this.gpa = gpa;
    }

    public String getPosition(){
        return "Student";
    }


    @Override
    public double getPaymentAmount() {
        if (gpa > gpaForSalary){
            return salary;
        }
        else {
            return 0;
        }
    }

}
