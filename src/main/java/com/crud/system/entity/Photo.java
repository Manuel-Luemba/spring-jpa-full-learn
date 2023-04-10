package com.crud.system.entity;

import jakarta.persistence.*;

@Entity
public class Photo {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "proto_sequence")
    @SequenceGenerator(
            name = "photo_sequence",
            sequenceName = "photo_sequence",
    allocationSize = 1)
    @Column(name = "photo_id")
    private  Long id;
    private  Integer url_small;

    @OneToOne(mappedBy = "photo")
    private Book book;
}
