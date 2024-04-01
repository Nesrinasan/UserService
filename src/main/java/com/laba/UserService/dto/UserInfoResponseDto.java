package com.laba.UserService.dto;

public record UserInfoResponseDto(Long id, String name, String lastName, String email, String phoneNumber, boolean premium) {

}
