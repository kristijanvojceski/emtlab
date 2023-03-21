package mk.ukim.finki.emt.emtlab.models.dto;

import lombok.Data;
import mk.ukim.finki.emt.emtlab.models.Author;
import mk.ukim.finki.emt.emtlab.models.enumeration.Category;

@Data
public class BookDto {

    private String name;

    private Category category;

    private Author author;

    private Integer availableCopies;

    public BookDto() {
    }

    public BookDto(String name, Category category, Author author, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availableCopies;
    }
}
