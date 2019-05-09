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
public class Work implements Serializable{

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
    private LocalDateTime startDate;

    @Column
    private LocalDateTime endDate;

    @Column
    private LocalDateTime updatedDate;

    @Column
    private LocalDateTime createdDate;

    @Column
    private String summary;

    @Builder
    public Work(String company, String position, String website, LocalDateTime startDate, LocalDateTime endDate, String summary) {
        this.company = company;
        this.position = position;
        this.website = website;
        this.startDate = startDate;
        this.endDate = endDate;
        this.summary = summary;
    }
}
