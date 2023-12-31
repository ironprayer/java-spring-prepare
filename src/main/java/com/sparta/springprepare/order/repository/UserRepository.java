package com.sparta.springprepare.order.repository;

import com.sparta.springprepare.order.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String robbie);
}
