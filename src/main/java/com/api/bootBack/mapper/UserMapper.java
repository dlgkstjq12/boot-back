package com.api.bootBack.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.api.bootBack.dto.UserDto;

@Mapper
public interface UserMapper {
    UserDto findById(Long id);

    List<UserDto> findAll();

    boolean findByUsername(String name);
}
