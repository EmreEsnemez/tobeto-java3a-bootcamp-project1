package com.samiayaz.bootcamp.model.bootcamp;

import com.samiayaz.bootcamp.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "bootcamp_states")
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BootcampState extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "bootcampState", fetch = FetchType.LAZY)
    @Setter(AccessLevel.PRIVATE)
    private List<Bootcamp> bootcamps;
}
