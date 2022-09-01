package com.example.posttest.api.repositories;

import com.example.posttest.api.entities.UserDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDataEntity, Integer> {
}
