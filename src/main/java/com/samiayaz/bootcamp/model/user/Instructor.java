package com.samiayaz.bootcamp.model.user;

import com.samiayaz.bootcamp.model.bootcamp.Bootcamp;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "instructors")
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Instructor extends User {

    private String companyName;

    @OneToMany(mappedBy = "instructor", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @Setter(AccessLevel.PRIVATE)
    private List<Bootcamp> bootcamps;
}
