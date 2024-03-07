package com.samiayaz.bootcamp.model.user;

import com.samiayaz.bootcamp.model.application.Application;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "applicants")
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Applicant extends User {

    private String about;

    @OneToMany(mappedBy = "applicant", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @Setter(AccessLevel.PRIVATE)
    private List<Application> applications;
}
