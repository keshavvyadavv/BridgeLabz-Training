package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

class Book {
    private String title;
    private String genre;
    private int pages;

    public Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }
}

public class LibraryBookStatistics {

    public static void main(String[] args) {

        List<Book> books = List.of(
            new Book("Java Basics", "Programming", 300),
            new Book("Advanced Java", "Programming", 450),
            new Book("World History", "History", 500),
            new Book("Ancient Civilizations", "History", 350),
            new Book("Cooking 101", "Cooking", 200),
            new Book("Baking Secrets", "Cooking", 150)
        );

        Map<String, IntSummaryStatistics> statsByGenre =
            books.stream()
                 .collect(Collectors.groupingBy(
                     Book::getGenre,
                     Collectors.summarizingInt(Book::getPages)
                 ));

        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("  Total Pages: " + stats.getSum());
            System.out.println("  Average Pages: " + stats.getAverage());
            System.out.println("  Max Pages: " + stats.getMax());
            System.out.println("  Min Pages: " + stats.getMin());
            System.out.println("  Book Count: " + stats.getCount());
            System.out.println();
        });
    }
}

