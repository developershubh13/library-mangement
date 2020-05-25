package com.example.librarymanagement.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Books")
public class Books {

    @Id
    private int bookId;
    private String title;
    private String author;
    private int noOfCopies;
    private List<Integer> students;
    private List<Integer> teachers;

    public Books(){

    }

    public Books(int bookId, String title, String author, int noOfCopies, List<Integer> students, List<Integer> teachers) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.noOfCopies = noOfCopies;
        this.students = students;
        this.teachers = teachers;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public List<Integer> getStudents() {
        return students;
    }

    public void setStudents(List<Integer> students) {
        this.students = students;
    }

    public List<Integer> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Integer> teachers) {
        this.teachers = teachers;
    }
}
