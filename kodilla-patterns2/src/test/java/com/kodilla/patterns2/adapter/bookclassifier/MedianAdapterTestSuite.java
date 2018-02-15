package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Booka;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Booka book1 = new Booka("Stanisław Lem", "Solaris", 1961, "1565");
        Booka book2 = new Booka("Stanisław Lem", "Niezwyciężony", 1964, "1332");
        Booka book3 = new Booka("Janusz Zajdel", "Limes inferior", 1982, "2010");
        Booka book4 = new Booka("Janusz Zajdel", "Cyliner van Troffa", 1980, "1987");

        Set<Booka> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);

        //When
        int result = medianAdapter.publicationYearMedian(bookSet);
        System.out.println(result);

        //Then
        Assert.assertEquals(1980, result);


    }
}
