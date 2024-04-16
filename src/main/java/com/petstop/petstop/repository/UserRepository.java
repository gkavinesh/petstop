package com.petstop.petstop.repository;

import com.petstop.petstop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
}
