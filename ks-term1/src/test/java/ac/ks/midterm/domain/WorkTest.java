package ac.ks.midterm.domain;

import ac.ks.midterm.repository.WorkRepository;
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
public class WorkTest {

    @Autowired
    private WorkRepository workRepository;

    private Work savedWork;

    @Before
    public void init() {
        savedWork = workRepository.save(Work.builder()
                .company("(주) 홍길동")
                .position("개발자")
                .website("//www.company.domain")
                .startDate(LocalDateTime.of(2019,1,1,0,0,0))
                .endDate(LocalDateTime.of(2019,1,1,0,0,0))
                .build());
    }

    @Test
    public void testFindID() {
        Work foundWork = workRepository.findById(savedWork.getIdx()).orElse(null);
        assertThat(foundWork.getIdx()).isEqualTo(savedWork.getIdx());
    }

}
