package module3.homeWork3;

import java.util.Random;

public class Employee {
    String name;
    String surname;
    Random random = new Random();
    int id;


    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        id = random.nextInt(1000);
    }

    public Employee() {
        id = random.nextInt(1000);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public int getId() {
        return id;
    }


    public void print() {
        System.out.println(getId());
        if (getName() != null) {
            System.out.println(getName());
        }
        if (getSurname() != null) {
            System.out.println(getSurname());
        }
        System.out.println("-----------------------------");
    }
}
