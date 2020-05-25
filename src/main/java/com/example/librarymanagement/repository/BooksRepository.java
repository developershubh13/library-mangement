package com.example.librarymanagement.repository;

import com.example.librarymanagement.model.Books;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
public interface BooksRepository extends MongoRepository<Books,Integer> {

    public List<Books> getBookByTitle(String title);

    @Query("{'title' : ?0}")
    public List<Books> getById(String title);

    @DeleteQuery("{'bookId' : ?0}")
    public void deleteId(int bookId);
}
