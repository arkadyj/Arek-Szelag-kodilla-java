package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    private Company softwareMachine;
    private Company dataMaesters;
    private Company greyMatter;

    @Before
    public void beforeTest() {
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "smith");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        softwareMachine = new Company("Software Machine");
        dataMaesters = new Company("Data Maesters");
        greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);


    }

    @After
    public void afterTest() {
        try {
            companyDao.delete(softwareMachine);
            companyDao.delete(dataMaesters);
            companyDao.delete(greyMatter);
        } catch (Exception e) {
            System.out.println("Error: " +e);
        }

    }


    @Test
    public void testSaveManyToMany() {
        //Given


        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);
    }

    @Test
    public void testRetrieveEmployee() {
        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        List<Employee> retrievedEmployee = employeeDao.retrieveEmployeeByLastname("smith");

        //Then
        Assert.assertEquals(2, retrievedEmployee.size());
    }

    @Test
    public void testRetrieveCompany() {
        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        List<Company> retrievedCompany = companyDao.getCompany("dat");

        //Then
        Assert.assertEquals(1, retrievedCompany.size());
    }

    @Test
    public void testAnotherSelect() {

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        List<Company> retrievedCompany = companyDao.findCompanyStartWith("%M%");

        System.out.println("test");
        System.out.println(retrievedCompany.size());

        for(Company company:retrievedCompany){
            System.out.println(company);
        }

    }
}