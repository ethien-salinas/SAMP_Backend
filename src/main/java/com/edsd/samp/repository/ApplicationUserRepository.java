package com.edsd.samp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.edsd.samp.entity.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

    ApplicationUser findByUsername(String username);

}