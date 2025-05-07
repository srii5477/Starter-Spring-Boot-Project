package com.sridevi.library.controller;

import com.sridevi.library.model.Library;
import com.sridevi.library.repository.LibraryRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController {
    private final LibraryRepository repo; // can never be reassigned, must be initialized in the constructor
    public LibraryController(LibraryRepository repo) {
        this.repo = repo;
    }
    @GetMapping("/")
    public String home() {
        return "Welcome to the homepage of Sridevi's Library.";
    }
    @GetMapping("/view")
    public List<Library> view() {
        return repo.findAll();
    }
}
