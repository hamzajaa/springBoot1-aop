package com.example.springbootaop;

import com.example.springbootaop.bean.Employee;
import com.example.springbootaop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAopApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootAopApplication.class, args);

//        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
//        employeeService.addEmployee(new Employee(100L, "hamza","jaa","hamza@gmail.com"));
//        employeeService.getEmployeeById(100L);
//        employeeService.getAllEmployees();

    }

    @Override
    public void run(String... args) throws Exception {
        employeeService.addEmployee(new Employee(100L, "hamza","jaa","hamza@gmail.com"));
        employeeService.getEmployeeById(100L);
        employeeService.getAllEmployees();

    }
}
