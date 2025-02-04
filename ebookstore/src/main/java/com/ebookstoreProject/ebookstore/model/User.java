package com.ebookstoreProject.ebookstore.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer Id;
    private String Username;

    private String Password;
    private ArrayList<String> Basket;
}
