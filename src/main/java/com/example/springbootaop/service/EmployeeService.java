package com.example.springbootaop.service;

import com.example.springbootaop.bean.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployees() {
        System.out.println("Method getAllEmployees() called");
        return employees;
    }

    public Employee getEmployeeById(Long id) {
        System.out.println("Method getEmployeeById() called");
        Optional<Employee> employee1 = employees.stream().filter(employee -> employee.getId().equals(id)).findFirst();
        for (Employee employee : employees) {
            if (Objects.equals(employee.getId(), id)) {
                return employee;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee) {
        System.out.println("Method addEmployee() called");
        employees.add(employee);
    }

    public void updateEmployee(Employee employeeDetails) {
        System.out.println("Method updateEmployee() called");
        for (Employee employee : employees) {
            if (Objects.equals(employee.getId(), employeeDetails.getId())) {
                employees.remove(employee);
                employees.add(employeeDetails);
            }
        }
    }

    public void deleteEmployee(Long employeeId) {
        System.out.println("Method deleteEmployee() called");
        for (Employee employee : employees) {
            if (Objects.equals(employee.getId(), employeeId)) {
                employees.remove(employee);
            }
        }
    }


}
