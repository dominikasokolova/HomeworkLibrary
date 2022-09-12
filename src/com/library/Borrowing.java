package com.library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Borrowing {
    private Book book;
    private Subscriber subscriber;
    private LocalDate dateOfBorrowing;
    private LocalDate returnDate;

    public Borrowing(Book book, Subscriber subscriber, LocalDate dateOfBorrowing) {
        this.book = book;
        this.subscriber = subscriber;
        this.dateOfBorrowing = dateOfBorrowing;
    }

    public Borrowing(Book book, Subscriber subscriber, LocalDate dateOfBorrowing, LocalDate returnDate) {
        this.book = book;
        this.subscriber = subscriber;
        this.dateOfBorrowing = dateOfBorrowing;
        this.returnDate = returnDate;
    }

    public void setReturnDate(LocalDate date) {
        returnDate = date;
    }

    public long numberOfDays() {
        if (returnDate == null) {
            return ChronoUnit.DAYS.between(dateOfBorrowing, LocalDate.now());
        } else {
            return ChronoUnit.DAYS.between(dateOfBorrowing, returnDate);
        }
    }
}
