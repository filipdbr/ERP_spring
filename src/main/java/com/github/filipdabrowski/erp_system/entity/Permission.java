package com.github.filipdabrowski.erp_system.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * Represents a Permission entity (table) in the database.
 * Will be used to store permissions
 * //todo define relationship with RolePermission
 */
@Entity
@Table(name = "permission") // Maps this class to the "permission" table in the database
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    @Column(name = "permission_id") // Maps to the "permission_id" column
    private int permissionId;

    @NotBlank(message = "Permission name is required") // Ensures that field is not blank. Generates the message for the user
    @Size(max = 100, message = "Permission name must be less than 100 characters") // Limits the size of the permission name
    @Column(name = "permission_name", length = 100, nullable = false) // Maps to the "permission_name" column
    private String permissionName;

    /**
     * Default constructor (required by JPA).
     */
    public Permission() {
    }

    /**
     * Parameterized constructor to initialize the permission name.
     * @param permissionName The name of the permission.
     */
    public Permission(String permissionName) {
        this.permissionName = permissionName;
    }

    // Getters and Setters

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    /**
     * Returns a string representation of the Permission object.
     * Useful for debugging.
     */
    @Override
    public String toString() {
        return "Permission{" +
                "permissionId=" + permissionId +
                ", permissionName='" + permissionName + '\'' +
                '}';
    }
}
