package com.laba.UserService.service;
import com.laba.UserService.dto.UserInfoResponseDto;
import com.laba.UserService.dto.UserSaveRequestDto;
import com.laba.UserService.entity.Users;
import com.laba.UserService.exception.GeneralException;
import com.laba.UserService.mapper.UserMapper;
import com.laba.UserService.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    public void save(UserSaveRequestDto userSaveRequestDto){
        Users users = userMapper.userSaveRequestDtoToUser(userSaveRequestDto);
        userRepository.save(users);

    }

    public UserInfoResponseDto info(Long userId){
        Optional<Users> optionalUsers = userRepository.findById(userId);
        Users users = optionalUsers.orElseThrow(GeneralException::new);
        return userMapper.userToInfoResponseDto(users);

    }

    public UserInfoResponseDto infoByPhoneNumber(String phoneNumber){
        Optional<Users> optionalUsers = userRepository.findByPhoneNumber(phoneNumber);
        Users users = optionalUsers.orElseThrow(GeneralException::new);
        return userMapper.userToInfoResponseDto(users);

    }

    public Optional<Users> findUserById(Long id){
        return userRepository.findById(id);
    }

}
