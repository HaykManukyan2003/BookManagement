package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

    private String title;
    private Author author;
    private String genre;
    private double price;
    private User registeredUser;

}
