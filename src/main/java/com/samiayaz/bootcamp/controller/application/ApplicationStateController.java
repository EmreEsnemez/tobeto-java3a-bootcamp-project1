package com.samiayaz.bootcamp.controller.application;

import com.samiayaz.bootcamp.dto.application.state.request.CreateApplicationStateRequest;
import com.samiayaz.bootcamp.dto.application.state.request.EditApplicationStateRequest;
import com.samiayaz.bootcamp.model.application.ApplicationState;
import com.samiayaz.bootcamp.service.application.ApplicationStateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications/states")
@RequiredArgsConstructor
public class ApplicationStateController {
    private final ApplicationStateService applicationStateService;

    @GetMapping
    public List<ApplicationState> get() {
        return applicationStateService.get();
    }

    @GetMapping("/{id}")
    public ApplicationState getById(@PathVariable Integer id) {
        // TODO check id here
        return applicationStateService.getById(id);
    }

    @PostMapping("/create")
    public boolean create(@RequestBody CreateApplicationStateRequest createApplicationStateRequest) {
        // TODO check createApplicationStateRequest here
        return applicationStateService.create(createApplicationStateRequest);
    }

    @PutMapping("/edit/{id}")
    public boolean editById(@PathVariable Integer id, @RequestBody EditApplicationStateRequest editApplicationStateRequest) {
        // TODO check editBootcampStateRequest here
        return applicationStateService.editById(id, editApplicationStateRequest);
    }

    @DeleteMapping("/remove/{id}")
    public boolean removeById(@PathVariable Integer id) {
        // TODO check id here
        return applicationStateService.removeById(id);
    }
}
