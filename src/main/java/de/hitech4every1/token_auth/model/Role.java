package de.hitech4every1.token_auth.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "role")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name="role_name")
    private String roleName;

    @Column(name="description")
    private String description;

}
