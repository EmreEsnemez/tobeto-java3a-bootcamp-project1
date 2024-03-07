package com.samiayaz.bootcamp.controller.bootcamp;

import com.samiayaz.bootcamp.service.bootcamp.BootcampService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bootcamps")
@RequiredArgsConstructor
public class BootcampController {
    private final BootcampService bootcampService;
}
