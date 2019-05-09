package ac.ks.midterm.domain;

import ac.ks.midterm.repository.LocationRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class LocationTest {

    @Autowired
    private LocationRepository locationRepository;

    private Location savedLocation;

    @Before
    public void init() {
        savedLocation = locationRepository.save(Location.builder()
                .address("부산광역시 00구 00번길 000")
                .postCode("12345")
                .build());
    }

    @Test
    public void testFindID() {
        Location foundLocation = locationRepository.findById(savedLocation.getIdx()).orElse(null);
        assertThat(foundLocation.getIdx()).isEqualTo(savedLocation.getIdx());
    }

}
