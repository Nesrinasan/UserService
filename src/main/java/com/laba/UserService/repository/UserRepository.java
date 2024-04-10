package com.laba.UserService.repository;

import com.laba.UserService.dto.UserInfoResponseDto;
import com.laba.UserService.entity.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<Users, Long> {

    Optional<Users> findByPhoneNumber(String phoneNumber);


}
