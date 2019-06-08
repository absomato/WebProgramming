package com.n2015642087.main.domain;

import com.n2015642087.main.repository.ProfileRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProfileTest {
    @Autowired
    private ProfileRepository profileRepository;

    private Profile savedProfile;

    @Before
    public void init(){
        savedProfile = profileRepository.save(Profile.builder()
        .network("트위터")
        .userName("@hong")
        .createdDate(LocalDateTime.of(2019,5,21,19,33,21))
        .build());
    }

    @Test
    public void testFindId(){
        Profile foundProfile = profileRepository.findById(savedProfile.getIdx()).orElse(null);
        assertThat(foundProfile.getIdx()).isEqualTo(savedProfile.getIdx());
    }

}
