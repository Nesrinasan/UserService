package com.laba.UserService.repository;

import com.laba.UserService.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {
}
