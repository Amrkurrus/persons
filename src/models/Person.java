package models;

public abstract class Person implements Payable, Comparable<Person> {
    protected int id;
    protected static int idCounter = 0;
    protected String name;
    protected String surname;
    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Person() {
        idCounter += 1;
        id = idCounter;
    }
    public Person(String name, String surname) {
        idCounter += 1;
        id = idCounter;
        this.name = name;
        this.surname = surname;
    }
    public abstract String getPosition();
    @Override
    public int compareTo(Person o) {
        return (int) (getPaymentAmount()-o.getPaymentAmount());
    }
}
