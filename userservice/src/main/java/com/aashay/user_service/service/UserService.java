package com.aashay.user_service.service;

import com.aashay.user_service.dto.UserDto;

public interface UserService {
    public UserDto createUser(UserDto input);
    public UserDto getUserById(Long id);
    public void updateUser(Long id, UserDto dto);
    public void deleteUser(Long id);

}
