package com.samiayaz.bootcamp.dto.user.applicant.request;

import com.samiayaz.bootcamp.dto.user.request.CreateUserRequest;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CreateApplicantRequest extends CreateUserRequest {

    private String about;
}
