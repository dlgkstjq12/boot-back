package com.api.bootBack.mapleProject.dto;

import com.api.bootBack.mapleProject.entity.User;

public record UserDto(
        Long id,
        String email,
        String name,
        String phone,
        Boolean isVerified,
        Boolean isActive
    ) {
        public static UserDto from(User user) {
            return new UserDto(
                user.getId(),
                user.getEmail(),
                user.getName(),
                user.getPhone(),
                user.getIsVerified(),
                user.getIsActive()
            );
        }
    }

