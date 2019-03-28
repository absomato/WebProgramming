package ac.kr.web.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
//Lombok
@Getter
@NoArgsConstructor
//JPA
@Entity
@Table

public class Board implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idx;
    @Column
    private String title;
    @Column
    private String subTitle;
    @Column
    private String content;
    @Column
    @Enumerated(EnumType.STRING)
    private BoardType boardType;
    @Column
    private LocalDate createDate;
    @Column
    private LocalDate updateDate;

    @Builder
    public Board(String title, String subTitle, String content, BoardType boardType, LocalDate createDate, LocalDate updateDate) {
        this.title = title;
        this.subTitle = subTitle;
        this.content = content;
        this.boardType = boardType;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }
}
