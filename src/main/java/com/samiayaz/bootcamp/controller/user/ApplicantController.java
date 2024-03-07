package com.samiayaz.bootcamp.controller.user;

import com.samiayaz.bootcamp.dto.user.applicant.request.CreateApplicantRequest;
import com.samiayaz.bootcamp.dto.user.applicant.request.EditApplicantRequest;
import com.samiayaz.bootcamp.model.user.Applicant;
import com.samiayaz.bootcamp.service.user.ApplicantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/applicants")
@RequiredArgsConstructor
public class ApplicantController {
    private final ApplicantService applicantService;
    
    @GetMapping("/login")
    public Applicant getByEmailOrUserNameAndPassword(@RequestParam String user, @RequestParam String password) {
        return null;
    }

    @PostMapping("/create")
    public boolean create(@RequestBody CreateApplicantRequest createApplicantRequest) {
        // TODO check user here
        return applicantService.create(createApplicantRequest);
    }

    @PutMapping("/edit/{id}")
    public boolean editById(@PathVariable Integer id, @RequestBody EditApplicantRequest editApplicantRequest) {
        // TODO check id and user here
        return applicantService.editById(id, editApplicantRequest);
    }

    @DeleteMapping("/remove/{id}")
    public boolean removeById(@PathVariable Integer id) {
        // TODO check id here
        return applicantService.removeById(id);
    }
}
