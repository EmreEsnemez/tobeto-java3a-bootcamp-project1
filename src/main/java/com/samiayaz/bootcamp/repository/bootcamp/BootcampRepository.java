package com.samiayaz.bootcamp.repository.bootcamp;

import com.samiayaz.bootcamp.model.bootcamp.Bootcamp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BootcampRepository extends JpaRepository<Bootcamp, Integer> {
}
