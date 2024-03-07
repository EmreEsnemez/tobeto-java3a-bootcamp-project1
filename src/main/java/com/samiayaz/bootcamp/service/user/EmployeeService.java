package com.samiayaz.bootcamp.service.user;

import com.samiayaz.bootcamp.repository.user.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
}
