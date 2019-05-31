package ac.ks.web7.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

//Lombok
@Getter
@Setter

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

    @Builder
    public Location(String address, String postcode){
        this.address=address;
        this.postcode=postcode;
    }
}
