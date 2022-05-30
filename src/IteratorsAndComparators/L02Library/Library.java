package IteratorsAndComparators.L02Library;

import IteratorsAndComparators.L01Book.Book;

import java.util.Iterator;

public class Library implements Iterable<Book>{
    private final Book[] books;

    public Library(Book...books){
        this.books = books;
    }

    public Book get(int index){
        return this.books[index];
    }

    public int size(){
        return this.books.length;
    }

    private class LibIterator implements Iterator<Book>{

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < size();
        }

        @Override
        public Book next() {
            return get(index++);
        }
    }
    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }
}
