package com.laba.UserService.mapper;

import com.laba.UserService.dto.UserInfoResponseDto;
import com.laba.UserService.dto.UserSaveRequestDto;
import com.laba.UserService.entity.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    Users userSaveRequestDtoToUser(UserSaveRequestDto userSaveRequestDto);

    UserInfoResponseDto userToInfoResponseDto(Users users);


}
