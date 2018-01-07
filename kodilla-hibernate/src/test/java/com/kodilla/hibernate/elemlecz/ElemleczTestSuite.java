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

    @Autowired
    private PobytDao pobytDao;
    @Autowired
    private JosDao josDao;
    @Autowired
    private WykEleczDao wykEleczDao;

    @Test
    public void testPobyt() {

        Jos jos1 = new Jos("Poradnia Ogólna");
        Pobyt pob1 = new Pobyt("2018-01-05 12:10");
        //Pobyt pob2 = new Pobyt("2018-01-05 12:30");
        WykElecz wykElecz = new WykElecz();

        wykElecz.getPobytList().add(pob1);

        //josDao.save(jos1);

        //jos1.getPobytList().add(pob1);
        //jos1.getPobytList().add(pob2);

        pob1.setJos(jos1);
        //pob2.setJos(jos1);

        //pobytDao.save(pob1);
        //pobytDao.save(pob2);

        //pobytDao.delete(pob1);
        //pobytDao.delete(pob2);

        wykEleczDao.save(wykElecz);

    }


}
