package com.example.sygesco.repo;

import com.example.sygesco.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepo extends JpaRepository<AppUser, Long> {
//    AppUser findByUsername(String username);
    AppUser findAppUserById(Long id);

}