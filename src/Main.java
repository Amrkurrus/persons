import models.*;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Person> persons = new ArrayList<>();

        Employee p1 = new Employee("Ringo", "Starr", "service worker", 234000);
        Student p3 = new Student();
        p3.setName("Rassul");
        p3.setGpa(0.1);
        p3.setSurname("Turtulov");
        Student p2 = new Student("X Æ A-12", "Musk", 3.5);

        persons.add(p3);
        persons.add(p2);
        persons.add(p1);

        Collections.sort(persons);
        printData(persons);
    }

    public static void printData(Iterable<Person> persons){
        for (Person i : persons) {
            System.out.println(i.toString() + " earns " + i.getPaymentAmount() + " tenge");
        }
    }
}
