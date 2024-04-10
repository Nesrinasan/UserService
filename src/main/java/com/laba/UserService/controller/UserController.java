package com.laba.UserService.controller;


import com.laba.UserService.dto.UserInfoResponseDto;
import com.laba.UserService.dto.UserSaveRequestDto;
import com.laba.UserService.service.UserService;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public void save(@RequestBody UserSaveRequestDto userSaveRequestDto) {
        userService.save(userSaveRequestDto);
    }

    @GetMapping("/info")
    public ResponseEntity<UserInfoResponseDto> info(@RequestParam Long userId) {
        return ResponseEntity.ok().body(userService.info(userId));

    }


    @GetMapping("/infoByNumber")
    public ResponseEntity<UserInfoResponseDto> infoByPhoneNumber(@RequestParam String phoneNumber) {
        return ResponseEntity.ok().body(userService.infoByPhoneNumber(phoneNumber));

    }
}
