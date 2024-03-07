package com.samiayaz.bootcamp.service.user;

import com.samiayaz.bootcamp.repository.user.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InstructorService {
    private final InstructorRepository instructorRepository;
}
