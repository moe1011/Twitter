package org.ac.cst8277.abdulla.mohammed.ums.dto;


import lombok.Data;
import org.ac.cst8277.abdulla.mohammed.ums.models.Role;

import java.util.List;

@Data
public class UserDTO {
    private String username;
    private String email;
    private List<Role> roles;
}
