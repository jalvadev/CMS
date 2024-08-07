package com.jalvadev.cms.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jalvadev.cms.models.User;

public interface UserRepository extends JpaRepository<User, UUID>{
}
