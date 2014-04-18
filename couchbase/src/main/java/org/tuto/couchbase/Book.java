package org.tuto.couchbase;

public class Book {
	 
    private String id;
    private String author;
    private String title;
    private String publisheer;
    private String date;
 
    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publisheer='" + publisheer + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
 
    public String getId() {
        return id;
    }
 
    public Book setId(String id) {
        this.id = id;
        return this;
    }
 
    public String getAuthor() {
        return author;
    }
 
    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }
 
    public String getTitle() {
        return title;
    }
 
    public Book setTitle(String title) {
        this.title = title;
        return this;
    }
 
    public String getPublisheer() {
        return publisheer;
    }
 
    public Book setPublisheer(String publisheer) {
        this.publisheer = publisheer;
        return this;
    }
 
    public String getDate() {
        return date;
    }
 
    public Book setDate(String date) {
        this.date = date;
        return this;
    }
}
