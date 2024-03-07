package com.samiayaz.bootcamp.model.application;

import com.samiayaz.bootcamp.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "application_states")
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ApplicationState extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "applicationState", fetch = FetchType.LAZY)
    @Setter(AccessLevel.PRIVATE)
    private List<Application> applications;
}
