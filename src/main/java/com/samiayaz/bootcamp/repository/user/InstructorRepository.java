package com.samiayaz.bootcamp.repository.user;

import com.samiayaz.bootcamp.model.user.Applicant;
import com.samiayaz.bootcamp.model.user.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {

    Applicant findByEmailOrUserNameAndPassword(String emailOrUserName, String password);
}
