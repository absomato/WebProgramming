package ac.ks.web.repository;

import ac.ks.web.domain.Account;
import ac.ks.web.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
