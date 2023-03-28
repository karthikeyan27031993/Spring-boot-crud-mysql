package com.example.crud.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="User")
public class User {

    @Column(name="User_Name")
    private String userName;

    @Column(name="Password")
    private String password;

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
}
