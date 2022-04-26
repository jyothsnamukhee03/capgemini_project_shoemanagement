package com.example.ShoeManagementSystem.repository;


import com.example.ShoeManagementSystem.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    Employee findByName(String EmpName);
}