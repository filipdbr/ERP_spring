package com.github.filipdabrowski.erp_system.repository;

import com.github.filipdabrowski.erp_system.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository provides basic CRUB operations for Role entity.
 */
@Repository
public interface RoleRepository extends JpaRepositry <Role, Integer> {
}