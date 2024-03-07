package com.samiayaz.bootcamp.model.application;

import com.samiayaz.bootcamp.model.BaseEntity;
import com.samiayaz.bootcamp.model.bootcamp.Bootcamp;
import com.samiayaz.bootcamp.model.user.Applicant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "applications")
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Application extends BaseEntity {

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, optional = false)
    private Applicant applicant;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, optional = false)
    private Bootcamp bootcamp;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, optional = false)
    private ApplicationState applicationState;
}
