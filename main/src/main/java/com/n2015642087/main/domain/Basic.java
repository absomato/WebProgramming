package com.n2015642087.main.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table
public class Basic implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String name;

    @Column
    private String label;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private LocalDateTime updatedDate;

    @Column
    private LocalDateTime createdDate;

    @Builder

    public Basic(String name, String label, String email, String phone, LocalDateTime updatedDate, LocalDateTime createdDate) {
        this.name = name;
        this.label = label;
        this.email = email;
        this.phone = phone;
        this.updatedDate = updatedDate;
        this.createdDate = createdDate;
    }
}
