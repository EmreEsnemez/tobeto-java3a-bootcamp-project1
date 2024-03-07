package com.samiayaz.bootcamp.model.user;

import com.samiayaz.bootcamp.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private LocalDateTime dateOfBirth;
    private String nationalId;

    private String userName;
    private String email;
    private String password;
}
