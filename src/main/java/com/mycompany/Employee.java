package com.mycompany;

/**
 * This class presents employee entity.
 * It has methods for getting and setting information about employee
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        String name = getFirstName() + " " + getLastName();
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return getSalary() * 12;
    }

    public int raiseSalary(int percent) {
        int newSalary = (int) Math.floor(getSalary() * (1 + percent / 100.0));
        return newSalary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name = " + getName() +
                ", salary=" + salary + ']';
    }
}
