package com.crud.system.entity;


import jakarta.persistence.*;

import java.util.Collection;
import java.util.Date;

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
    @Column(name = "book_id")
    private Long Id;

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private Integer page;
    private Double rating;
    @Column(nullable = false)
    private Date publishedDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "photo_id")
    private Photo photo;



    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "books_categories",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Collection<Category> categories;

}