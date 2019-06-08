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
public class Profile implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String network;

    @Column
    private String userName;

    @Column
    private String url;

    @Column
    private LocalDateTime updatedDate;

    @Column
    private LocalDateTime createdDate;

    @Builder
    public Profile(String network, String userName, String url, LocalDateTime updatedDate, LocalDateTime createdDate) {
        this.network = network;
        this.userName = userName;
        this.url = url;
        this.updatedDate = updatedDate;
        this.createdDate = createdDate;
    }
}
