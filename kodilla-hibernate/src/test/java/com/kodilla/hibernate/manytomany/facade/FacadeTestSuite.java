package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private CompanyFacade companyFacade;

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

        companyFacade.companyDao.save(softwareMachine);
        companyFacade.companyDao.save(dataMaesters);
        companyFacade.companyDao.save(greyMatter);


    }

    @After
    public void afterTest() {
        try {
            companyFacade.companyDao.delete(softwareMachine);
            companyFacade.companyDao.delete(dataMaesters);
            companyFacade.companyDao.delete(greyMatter);
        } catch (Exception e) {
            System.out.println("Error: " +e);
        }

    }

    @Test
    public void testGetCompany() {
        int companyCount = companyFacade.getCompanyByName("%S%").size();
        System.out.println(companyCount);
    }

    @Test
    public void testGetEmployee() {
        int employeeCount = companyFacade.getEmployeesByName("%h").size();
        System.out.println(employeeCount);
    }

}
