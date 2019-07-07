/*
 * Copyright 2017-2019 Pamarin.com
 */
package com.pamarin.learning.webflux.repository;

import com.pamarin.learning.webflux.domain.Authority;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jitta
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {

    Optional<Authority> findByName(String name);

}
