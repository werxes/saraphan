package com.code.saraphan.repo;
import com.code.saraphan.domain.Message;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
