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
public class Work implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String company;

    @Column
    private String position;

    @Column
    private String website;

    @Column
    private LocalDateTime startdate;

    @Column
    private LocalDateTime enddate;

    @Column
    private String summry;

    @Column
    private LocalDateTime updatedDate;

    @Column
    private LocalDateTime createdDate;


    @Builder
    public Work(String company, String position, String website, LocalDateTime startdate, LocalDateTime enddate, String summry){
        this.company=company;
        this.position=position;
        this.website=website;
        this.startdate=startdate;
        this.enddate=enddate;
        this.summry=summry;
    }

}
