package com.ebookstoreProject.ebookstore.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.NonNull;


import java.util.ArrayList;
@Entity
@Data
@Table(name="users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer Id;
    private String Username;
    private String Password;
    private ArrayList<String> Basket;
}
