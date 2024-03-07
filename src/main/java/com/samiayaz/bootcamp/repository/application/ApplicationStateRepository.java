package com.samiayaz.bootcamp.repository.application;

import com.samiayaz.bootcamp.model.application.ApplicationState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationStateRepository extends JpaRepository<ApplicationState, Integer> {
}
