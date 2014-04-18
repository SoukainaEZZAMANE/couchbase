package org.tuto.couchbase;

import com.couchbase.client.CouchbaseClient;
import com.google.gson.Gson;
import org.junit.Test;

public class CreateBooks {

	@Test
    public void createBooks() throws Exception {
 
        CouchbaseClient client = CouchbaseConnection.newCouchbaseClient();
        Gson gson = new Gson();
        Book book;
 
        book = new Book()
                .setId("1")
                .setTitle("The Hunger Games")
                .setAuthor("Suzanne Collins")
                .setPublisheer("Scholastic Press")
                .setDate("2008-09-14");
        client.set("book_"+book.getId(), gson.toJson(book));
 
        book = new Book()
                .setId("2")
                .setTitle("The Help")
                .setAuthor("Kathryn Stockett")
                .setPublisheer("Amy Einhorn Books")
                .setDate("2009-02-10");
        client.set("book_"+book.getId(), gson.toJson(book));
 
        book = new Book()
                .setId("3")
                .setTitle("Harry Potter and the Sorcerer's Stone")
                .setAuthor("J.K. Rowling")
                .setPublisheer("Scholastic Press")
                .setDate("2003-11-01");
        client.set("book_"+book.getId(), gson.toJson(book));
 
        book = new Book()
                .setId("4")
                .setTitle("A Thousand Splendid Suns")
                .setAuthor("Khaled Hosseini")
                .setPublisheer("Riverhead Hardcover")
                .setDate("2007-05-22");
        client.set("book_"+book.getId(), gson.toJson(book));
 
        book = new Book()
                .setId("5")
                .setTitle("Harry Potter and the Deathly Hallows")
                .setAuthor("J.K. Rowling")
                .setPublisheer("Arthur A. Levine Books")
                .setDate("2007-07-21");
        client.set("book_"+book.getId(), gson.toJson(book));
 
    }
}
