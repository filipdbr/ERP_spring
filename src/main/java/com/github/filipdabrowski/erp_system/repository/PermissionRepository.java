package com.github.filipdabrowski.erp_system.repository;

import com.github.filipdabrowski.erp_system.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository provides basic CRUD operations for Permission entity.
 */
@Repository
public interface PermissionRepository extends JpaRepository<Permission, Integer> {
}
