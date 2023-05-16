package com.example.bookManageSystem_CRUD;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")

public class BookController {
    private final Map<String,Book> bookMap = new HashMap<>();
    private final Map<String,Author> authorMap = new HashMap<>();

    @PostMapping("/authors")
    public Author addAuthor(@RequestBody Author author) {
        authorMap.put(author.getName(),author);
        return author;
    }
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        bookMap.put(book.getBookName(),book);
        return book;
    }
    @GetMapping("/authors")
    public List<Author> getAuthorsByAgeAndRating(@RequestParam int age, @RequestParam float rating) {
        return authorMap.values().stream()
                .filter(author -> author.getAge() < age && author.getRating() > rating)
                .collect(Collectors.toList());
    }

    @PutMapping("/books/{bookName}")
    public Book updateBookPages(@PathVariable String bookName,@RequestParam int pages) {
        Book book = bookMap.get(bookName);
        if(book != null) {
            book.setPages(pages);
            return book;
        }
        return null;
    }

    @GetMapping("/books/count")
    public int getTotalBooksByAuthorsWithRating(@RequestParam float rating) {
        return (int) bookMap.values().stream()
                .filter(book -> book.getAuthor().getRating() > rating)
                .count();
    }

}
