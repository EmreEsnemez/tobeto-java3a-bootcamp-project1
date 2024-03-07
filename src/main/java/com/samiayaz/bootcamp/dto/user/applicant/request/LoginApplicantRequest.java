package com.samiayaz.bootcamp.dto.user.applicant.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class LoginApplicantRequest {

    private String emailOrUserName;
    private String password;
}
