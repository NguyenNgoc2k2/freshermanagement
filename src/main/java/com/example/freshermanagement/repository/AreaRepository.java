package com.example.freshermanagement.repository;

import com.example.freshermanagement.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {
    Optional<Area> findByIdAndStatusTrue(Long id);
}
