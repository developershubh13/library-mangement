package com.example.librarymanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Teachers")
public class Teachers {

    @Id
    private int teacherId;
    private String teacherName;
    private String subject;
    private List<Integer> books;

    public Teachers() {
    }

    public Teachers(int teacherId, String teacherName, String subject, List<Integer> books) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.subject = subject;
        this.books = books;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Integer> getBooks() {
        return books;
    }

    public void setBooks(List<Integer> books) {
        this.books = books;
    }
}
