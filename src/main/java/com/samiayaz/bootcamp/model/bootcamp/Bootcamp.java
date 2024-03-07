package com.samiayaz.bootcamp.model.bootcamp;

import com.samiayaz.bootcamp.model.BaseEntity;
import com.samiayaz.bootcamp.model.application.Application;
import com.samiayaz.bootcamp.model.user.Instructor;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "bootcamps")
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Bootcamp extends BaseEntity {

    private String name;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.MERGE)
    private Instructor instructor;

    @ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.MERGE)
    private BootcampState bootcampState;

    @OneToMany(mappedBy = "bootcamp", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @Setter(AccessLevel.PRIVATE)
    private List<Application> applications;
}
