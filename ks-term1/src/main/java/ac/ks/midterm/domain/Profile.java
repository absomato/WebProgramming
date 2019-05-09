package ac.ks.midterm.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

// Lombok
@Getter
@Setter
@NoArgsConstructor

// JPA
@Entity
@Table
public class Profile implements Serializable{

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
    public Profile(String network, String userName, String url) {
        this.network = network;
        this.userName = userName;
        this.url = url;
    }
}
