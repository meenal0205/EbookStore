package com.ebookstoreProject.ebookstore.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name = "books")
public class BookEntity {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer BookId;
    @NonNull
    private String name;
    @NonNull
    private String Author;
    @NonNull
    private String Genre;
    @NonNull
    private String Description;
    @NonNull
    private Integer Stock;
    @NonNull
    private Integer Price;

}
