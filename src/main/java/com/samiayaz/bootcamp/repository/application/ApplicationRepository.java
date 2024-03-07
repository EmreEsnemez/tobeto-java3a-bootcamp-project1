package com.samiayaz.bootcamp.repository.application;

import com.samiayaz.bootcamp.model.application.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
