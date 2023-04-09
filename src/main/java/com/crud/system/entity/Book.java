package com.crud.system.entity;


import jakarta.persistence.*;

@Entity
public  class Book {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )@GeneratedValue(
            strategy = GenerationType.SEQUENCE, generator = "book_sequence"
    )
    private Long Id;
    private String title;
    private Integer page;

}