package com.mycompany;

/**
 * This class presents employee entity.
 * It has methods for getting and setting information about employee
 *
 * @author Mikhail Kurakin
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (salary != employee.salary) return false;
        if (!firstName.equals(employee.firstName)) return false;
        return lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + salary;
        return result;
    }
}
