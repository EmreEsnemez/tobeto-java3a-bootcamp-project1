package com.samiayaz.bootcamp.repository.user;

import com.samiayaz.bootcamp.model.user.Applicant;
import com.samiayaz.bootcamp.model.user.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Applicant findByEmailOrUserNameAndPassword(String emailOrUserName, String password);
}
