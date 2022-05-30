package IteratorsAndComparators.L04BookComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book{
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors){
        this.title = title;
        this.year = year;

        this.authors = new ArrayList<>();

        this.authors.addAll(Arrays.asList(authors));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", authors=" + authors +
                '}';
    }
}
