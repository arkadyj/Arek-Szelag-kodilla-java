package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product apple = new Product("apple");
        Item item1 = new Item(new BigDecimal(50), 5);
        Item item2 = new Item(new BigDecimal(10), 10);
        Invoice invoice = new Invoice("1/2018");

        //When
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item1.setProduct(apple);
        item2.setProduct(apple);

        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        int itemNumber = invoice.getItems().size();
        String invoiceNumber = invoice.getNumber();

        //Then
        Assert.assertEquals(2, itemNumber);
        Assert.assertEquals("1/2018", invoiceNumber);

        try {
            invoiceDao.delete(invoiceId);
        } catch(Exception e) {
            System.out.println("Error: "+ e);
        }
    }
}
