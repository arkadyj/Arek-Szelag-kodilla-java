package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Booka;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Bookb;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Booka> bookaSet) {
        Map<BookSignature, Bookb> books = new HashMap<>();
        if (bookaSet.size() == 0) return 0;
        for (Booka booka : bookaSet) {
            books.put(new BookSignature(booka.getSignature()), new Bookb(booka.getAuthor(), booka.getTitle(), booka.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
