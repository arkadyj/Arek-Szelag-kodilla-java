package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    List<Employee> retrieveEmployeeByLastname(@Param("LASTNAME") String lastname);

    @Query(value = "Select * from employees where upper(lastname) LIKE upper(:PARAM)",nativeQuery = true )
    List<Employee> findEmployeesByName(@Param("PARAM") String name);
}
