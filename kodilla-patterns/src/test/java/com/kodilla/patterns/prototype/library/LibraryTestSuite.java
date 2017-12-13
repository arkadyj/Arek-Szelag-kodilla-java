package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("Old library");
        library.getBooks().add(new Book("Limes inferior", "Janusz Zajdel", LocalDate.of(1982, 5, 13)));
        library.getBooks().add(new Book("Cylinder van Troffa", "Janusz Zajdel", LocalDate.of(1980, 11, 20)));
        library.getBooks().add(new Book("Foundation", "Issac Asimov", LocalDate.of(1951, 3, 9)));

        //When
        Library clonedShallowLibrary = null;
        try {
            clonedShallowLibrary = library.shallowCopy();
            clonedShallowLibrary.setName("Old library ver.2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library clonedDeepLibrary = null;
        try {
            clonedDeepLibrary = library.deepCopy();
            clonedDeepLibrary.setName("Old library ver.3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(new Book("Cylinder van Troffa", "Janusz Zajdel", LocalDate.of(1980, 11, 20)));

        System.out.println(library);
        System.out.println(clonedShallowLibrary);
        System.out.println(clonedDeepLibrary);

        //Then
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedShallowLibrary.getBooks().size());
        Assert.assertEquals(3, clonedDeepLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), clonedShallowLibrary.getBooks());
        Assert.assertNotEquals(clonedShallowLibrary.getBooks(), clonedDeepLibrary.getBooks());


    }
}
