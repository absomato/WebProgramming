package ac.ks.web7.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

//Lombok
@Setter
@Getter
@NoArgsConstructor

//JPA
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
    private String username;

    @Column
    private String url;

    @Column
    private LocalDateTime updatedDate;

    @Column
    private LocalDateTime createdDate;


    @Builder
    public Profile(String network, String username, String url){
        this.network=network;
        this.username=username;
        this.url=url;
    }
}
