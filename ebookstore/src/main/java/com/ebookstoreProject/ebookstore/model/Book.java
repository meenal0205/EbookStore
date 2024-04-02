package com.ebookstoreProject.ebookstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Book {
    private Integer BookId;

    private String name;
    private String Author;
    private String Genre;
    private String Description;
    private Integer Stock;
    private Integer Price;

}
