package com.code.saraphan.repo;
import com.code.saraphan.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}