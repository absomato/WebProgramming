package ac.ks.web.domain;

import ac.ks.web.repository.BoardRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class BoardTest {

    @Autowired
    private BoardRepository boardRepository;

    private Board savedBoard;

    @Before
    public void init() {
        savedBoard = boardRepository.save(Board.builder()
                .title("제목1")
                .subTitle("부제목1")
                .content("내용1")
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build());
    }

    @Test
    public void testFindBoard() {
        Board foundBoard = boardRepository.findById(savedBoard.getIdx()).orElse(null);
        assertThat(foundBoard.getIdx()).isEqualTo(savedBoard.getIdx());

    }

    @Test
    public void testFindTitleBoard(){
        Board foundBoard = boardRepository.findByTitle("제목1");
        assertThat(foundBoard.getTitle()).isEqualTo(savedBoard.getTitle());
    }

    @Test
    public void testUpdateBoard(){
        Board foundBoard = boardRepository.findByTitle("제목1");
        foundBoard.setContent("내용 수정");
        Board updateBoard = boardRepository.save(foundBoard);
        assertThat(foundBoard.getContent()).isEqualTo("내용 수정");

    }

    @Test
    public void deleteBoard(){
        Board foundBoard = boardRepository.findByTitle("제목1");
        boardRepository.delete(foundBoard);
        List<Board> boardList = boardRepository.findAll();
        assertThat(boardList.size()).isEqualTo(0);

    }
}
