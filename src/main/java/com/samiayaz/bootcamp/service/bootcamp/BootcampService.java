package com.samiayaz.bootcamp.service.bootcamp;

import com.samiayaz.bootcamp.repository.bootcamp.BootcampRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BootcampService {
    private final BootcampRepository bootcampRepository;
    private final BootcampStateService bootcampStateService;
}
