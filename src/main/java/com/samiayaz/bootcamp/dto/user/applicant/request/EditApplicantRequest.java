package com.samiayaz.bootcamp.dto.user.applicant.request;

import com.samiayaz.bootcamp.dto.user.request.EditUserRequest;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class EditApplicantRequest extends EditUserRequest {

    private String about;
}
