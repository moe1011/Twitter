package org.ac.cst8277.abdulla.mohammed.ums.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ac.cst8277.abdulla.mohammed.ums.enums.RoleName;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Role {
    @Id
    @Column(name = "role_id")
    private UUID roleId;
    private RoleName rolename;
}
