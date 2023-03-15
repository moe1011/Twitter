package org.ac.cst8277.abdulla.mohammed.ums.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @Column(name = "user_id")
    private UUID userId;
    private String username;
    private String email;
    private String password;

    @OneToMany
    private List<Role> roles;

}
