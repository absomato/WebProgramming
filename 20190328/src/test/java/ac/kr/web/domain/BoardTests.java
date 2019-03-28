package ac.kr.web.domain;

import ac.kr.web.repository.BoardRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
@RunWith(SpringRunner.class)
public class BoardTests {

    @Autowired
    private BoardRepository boardRepository;

    @Before
    public void init(){
        Board board= Board.builder()
                .content("Hello")
                .build();
        boardRepository.save(board);
    }

    @Test
    public void findBoardAll(){
        Board findBoard = boardRepository.findById(1L).orElse(null);
        System.out.println(findBoard.getContent());
    }
}
