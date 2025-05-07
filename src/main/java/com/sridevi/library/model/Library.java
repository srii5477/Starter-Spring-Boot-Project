package com.sridevi.library.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "library")
public class Library {
    @Getter
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String author;
    @Getter
    @Setter
    private Number stock;
    @Getter
    @Setter
    private String description;
    @Getter
    @Setter
    private String language;
    public Library() {}
    public Library(String title, String author, Number stock, String description, String language) {
        this.title = title;
        this.author = author;
        this.stock = stock;
        this.description = description;
        this.language = language;
    }
}
