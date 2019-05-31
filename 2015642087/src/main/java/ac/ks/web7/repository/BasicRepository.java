package ac.ks.web7.repository;

import ac.ks.web7.domain.Basic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BasicRepository extends JpaRepository<Basic,Long> {
    Basic findFirstByName(final String name);
}
