package com.samiayaz.bootcamp.repository.user;

import com.samiayaz.bootcamp.model.user.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant, Integer> {
    Applicant findByEmailOrUserNameAndPassword(String emailOrUserName, String password);
}
