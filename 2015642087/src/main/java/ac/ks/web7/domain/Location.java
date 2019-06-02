package ac.ks.web7.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

//Lombok
@Getter
@Setter
@NoArgsConstructor

//JPA
@Entity
@Table
public class Location implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String address;

    @Column
    private String postcode;

    @Column
    private LocalDateTime updatedDate;

    @Column
    private LocalDateTime createdDate;


    @Builder
    public Location(String address, String postcode){
        this.address=address;
        this.postcode=postcode;
    }
}
