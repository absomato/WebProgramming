package com.leejinseok.demo2.domain;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idx;

    private String name;

    @ManyToOne
    private Category category;

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdx() {
        return idx;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }


    //데이터베이스 값는 넣는 아주 당연한 것.
    public void setCategory(Category category) {
        //A가 널이 아니면 00하고
        //A가 널이면 00하고
        //B가 널이면 00하고
        //B가 널이 아니면 00하다.

        if(this.category!=null) {
            this.category.getBook().remove(this);

        }
        this.category = category;

        if(category!=null){
            category.getBook().add(this);

        }
    }
}
