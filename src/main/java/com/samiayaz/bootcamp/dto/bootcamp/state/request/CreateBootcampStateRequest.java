package com.samiayaz.bootcamp.dto.bootcamp.state.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CreateBootcampStateRequest {

    private String name;
}
