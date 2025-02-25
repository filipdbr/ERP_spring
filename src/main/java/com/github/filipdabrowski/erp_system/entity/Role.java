package com.github.filipdabrowski.erp_system.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * Represents a Role entity (table) in the database.
 * Will be used to store verious roles of the users.
 * //todo define raltionsips, create junctions table with Permission entity
 */
@Entity
@Table (name = "Role") // Maps this class to the "role" table in the database
public class Role {

    // ATTRIBUTES

    @Id
    @GeneratedValue(stategy = GenerationType.IDENTITY) // Auto-increment of PK
    @Column (name = role_id)
    private int roleId;

    @Notblank (message = "Role name is required")
    @Size (max = 50, message = "Role name cannot exceed 50 characters") //todo verify what's the diff between 50 size and 50 length
    @Column (name = "role_name", length = 50, nullable = false) // Max length = 50 characters, can't be null
    private String roleName;

    @Size (max = 255, message = "Role description cannot exceed 255 characters")
    @Column (name = "role_description", length = 255, nullable = true) // Max lenght = 255 characters. Accepts null values.
    private String roleDescription;

    @Column (name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column (name = "created_by", nullable = false)
    private String createdBy;

    @Column (name = "last_modified_at", nullable = true)
    private LocalDateTime lastModifiedAt;

    @Column (name = "last_modified_by", nullable = true)
    private String lastModifiedBy;

    // CONSTRUCTORS

    /**
     * Default constructor (required by JPA)
     */
    public Role() {
    }

    /**
     * Parametrized constructor to initialize the role
     */
    public Role(String roleName) {
        this roleName = roleName;
        this createdAt = now();
    }

    // METHODS

    // 1. GETTERS & SETTERS
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int new_roleId) {
        this.roleId = new_roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String new_roleDescription) {
        this.roleDescription = new_roleDescription;
    }

    public String getRoleDescription() {
        return this.roleDescription;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedBy() {
        return this.createdAt;
    }

    public LocalDateTime getLastModifiedAt() {
        return this.lastModifiedAt
    }

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    // OTHER METHODS
    /**
     * Returns a string representation of the Permission object.
     */
    @Override
    public String toString() {
        return "Role{" +
                "roleId = " + roleId +
                ", roleName = " + roleName +
                ", roleDescription = " + roleDescription
    }
}