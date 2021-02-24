package com.example.demo.dto;


import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * @author Krystal
 * @Date 2021/2/22  15:57
 */

@Data
@Builder
public class UserDto {
    private String nickName;
    private String mobile;
    private String password;
    private String role;
}
