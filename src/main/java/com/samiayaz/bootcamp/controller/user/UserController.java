package com.samiayaz.bootcamp.controller.user;

import com.samiayaz.bootcamp.dto.user.request.CreateUserRequest;
import com.samiayaz.bootcamp.dto.user.request.EditUserRequest;
import com.samiayaz.bootcamp.model.user.User;

public interface UserController {

    User getByEmailOrUserNameAndPassword(String emailOrUserName, String password);

    boolean create(CreateUserRequest createUserRequest);

    boolean editById(Integer id, EditUserRequest editUserRequest);

    boolean removeById(Integer id);
}
