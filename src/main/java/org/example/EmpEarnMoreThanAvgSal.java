package org.example;

import org.example.db.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpEarnMoreThanAvgSal {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees();

        Map<String, Double> avg = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.averagingDouble(Employee::getSalary)));

        List<String> result = employees.stream()
                .filter(e -> e.getSalary() > avg.get(e.getDept()))
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
