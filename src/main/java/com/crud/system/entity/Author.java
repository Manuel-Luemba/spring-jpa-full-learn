package com.crud.system.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Author {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "author_sequence"
    )
    @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1
    )
    @Column(name = "author_id")
    private Long Id;

    @Column(nullable = false)
    private String first_name;
    @Column(nullable = false)
    private String lats_name;
    private Date birth_date;
}
