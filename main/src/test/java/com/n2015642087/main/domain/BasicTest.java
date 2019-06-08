package com.n2015642087.main.domain;

import com.n2015642087.main.repository.BasicRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BasicTest {
    @Autowired
    private BasicRepository basicRepository;

    private Basic savedBasic;

    @Before
    public void init(){
        savedBasic = basicRepository.save(Basic.builder()
        .name("홍길동")
        .label("도적")
        .email("hong@gmail.com")
        .phone("012-3456-789")
        .build());
    }

    @Test
    public void testFindID(){
        Basic foundBasic = basicRepository.findById(savedBasic.getIdx()).orElse(null);
        assertThat(foundBasic.getIdx()).isEqualTo(savedBasic.getIdx());
    }
}
