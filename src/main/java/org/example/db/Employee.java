package org.example.db;

import java.util.Arrays;
import java.util.List;

public class Employee {

    private final String name;
    private final String dept;
    private final double salary;
    private final int age;

    public Employee(String name, String dept, double salary, int age) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.age = age;
    }


    public String getName() { return name; }
    public String getDept() { return dept; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }


    static List<Employee> emp = Arrays.asList(
            new Employee("Asha", "ENG", 90000,30),
            new Employee("Bala", "ENG", 120000,25),
            new Employee("Chirag", "HR", 60000, 22),
            new Employee("Deepti", "HR", 80000, 55),
            new Employee("Eshan", "ENG", 110000, 60),
            new Employee("Fara", "FIN", 95000, 15)
    );

    public static List<Employee> getEmployees() {
        return emp;
    }

}
