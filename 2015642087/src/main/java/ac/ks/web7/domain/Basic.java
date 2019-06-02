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
    public Basic(String name,String label,String email,String phone){
        this.name=name;
        this.label=label;
        this.email=email;
        this.phone=phone;
    }
}
