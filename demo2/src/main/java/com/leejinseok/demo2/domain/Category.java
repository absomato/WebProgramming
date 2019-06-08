package com.leejinseok.demo2.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idx;

    private String genre;


    //여기엔 콜렉션 타입만 옴
    @OneToMany(mappedBy = "category")
    private List<Book> book;

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getIdx() {
        return idx;
    }

    public String getGenre() {
        return genre;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }
}
