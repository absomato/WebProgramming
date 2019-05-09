package ks.ac.web5.domain;

import ks.ac.web5.repository.BoardRepository;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BoardTest {
    @Autowired
    private BoardRepository boardRepository;

    private Board savedBoard;

    @Before
    public
}
