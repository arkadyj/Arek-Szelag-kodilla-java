package com.kodilla.hibernate.elemlecz;

import com.kodilla.hibernate.elemlecz.dao.JosDao;
import com.kodilla.hibernate.elemlecz.dao.PobytDao;
import com.kodilla.hibernate.elemlecz.dao.WykEleczDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElemleczTestSuite {

    //@Autowired
    //private PobytDao pobytDao;
    @Autowired
    private JosDao josDao;
    //@Autowired
    //private WykEleczDao wykEleczDao;

    @Test
    public void testPobyt() {

        Jos jos1 = new Jos("Poradnia Ogólna");
        Doctor doctor1 = new Doctor("Super Doctor");
        Doctor doctor2 = new Doctor("Chirurg");
        Pobyt pob1 = new Pobyt("2018-01-05 12:10");
        Pobyt pob2 = new Pobyt("2018-01-05 12:30");



        pob1.setDoctor(doctor1);
        pob2.setDoctor(doctor2);
        jos1.getPobytList().add(pob1);
        jos1.getPobytList().add(pob2);

        josDao.save(jos1);




    }


}
