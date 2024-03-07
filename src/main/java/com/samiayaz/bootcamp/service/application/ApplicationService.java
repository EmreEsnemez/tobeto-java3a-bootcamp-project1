package com.samiayaz.bootcamp.service.application;

import com.samiayaz.bootcamp.repository.application.ApplicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationService {
    private final ApplicationRepository applicationRepository;
    private final ApplicationStateService applicationStateService;
}
