package com.fagenius.service;

import com.fagenius.entity.Employee;
import com.fagenius.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostConstruct
    public void initializeEmployeeTable() {
        employeeRepository.saveAll(
                Stream.of(
                        new Employee("Ibrahima", 90000),
                        new Employee("Raouf", 55000),
                        new Employee("Kamara", 12000)
                ).collect(Collectors.toList()));
    }

    public Employee getEmployee(int employeeId) {
        return employeeRepository
                .findById(employeeId)
                .orElse(null);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository
                .findAll();
    }
}

