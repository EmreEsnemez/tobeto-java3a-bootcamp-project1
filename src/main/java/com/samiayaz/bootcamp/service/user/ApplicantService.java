package com.samiayaz.bootcamp.service.user;

import com.samiayaz.bootcamp.dto.user.applicant.request.CreateApplicantRequest;
import com.samiayaz.bootcamp.dto.user.applicant.request.EditApplicantRequest;
import com.samiayaz.bootcamp.model.user.Applicant;
import com.samiayaz.bootcamp.repository.user.ApplicantRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicantService {
    private final ApplicantRepository applicantRepository;
    private final ModelMapper modelMapper;

    public Applicant getByEmailOrUserNameAndPassword(String emailOrUserName, String password) {
        return applicantRepository.findByEmailOrUserNameAndPassword(emailOrUserName, password);
    }

    public boolean create(CreateApplicantRequest createApplicantRequest) {
        Applicant applicant = modelMapper.map(createApplicantRequest, Applicant.class);
        return applicantRepository.save(applicant) != null;
    }

    public boolean editById(Integer id, EditApplicantRequest editApplicantRequest) {
        Applicant applicant = modelMapper.map(editApplicantRequest, Applicant.class);
        applicant.setId(id);
        return applicantRepository.save(applicant) != null;
    }

    public boolean removeById(Integer id) {
        applicantRepository.deleteById(id);
        return true;
    }
}
