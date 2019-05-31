package ac.ks.web7.domain;

import ac.ks.web7.repository.LocationRepository;
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

    private Location saveLocation;

    @Before
    public void init(){
        saveLocation = locationRepository.save(Location.builder()
        .address("부산광영시 00구 00번길 000")
        .postcode("12345")
        .build());
    }

    @Test
    public void testFindIDLocataion(){
        Location foundLocation = locationRepository.findById(saveLocation.getIdx()).orElse(null);
        assertThat(foundLocation.getIdx()).isEqualTo(saveLocation.getIdx());

    }
}
