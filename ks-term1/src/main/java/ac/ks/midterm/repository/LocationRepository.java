package ac.ks.midterm.repository;

import ac.ks.midterm.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
