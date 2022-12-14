package com.dlq.designPattern.iterator.java;

/**
 * @author KznAsg
 * @version 2022/8/22  12:51
 */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;
    
    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }
    
    public Book getBookAt(int index) {
        return books[index];
    }
    
    public void appendBook(Book book) {
        this.books[this.last] = book;
        this.last++;
    }
    
    public int getLength() {
        return last;
    }
    
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
