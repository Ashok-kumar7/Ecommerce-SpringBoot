package com.ecommercewebsite.ecommercewebsite.user.repository;

import com.ecommercewebsite.ecommercewebsite.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,String> {
    Optional<UserEntity> findByEmailId(String email);
}
