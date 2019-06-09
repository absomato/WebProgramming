package com.n2015642087.main.repository;

import com.n2015642087.main.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile,Long> {
    List<Profile> findAllByNetwork(final String name);
    Profile findFirstByNetwork(final String name);


}
