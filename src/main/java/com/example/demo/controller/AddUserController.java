package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;

import io.r2dbc.spi.Row;
import reactor.core.publisher.Flux;

/**
 * The type Add user controller.
 *
 * @author Krystal
 * @Date 2021 /2/22 15:57
 */
@RestController
@RequestMapping("/user")
public class AddUserController {
    private static final String SELECT_FROM_USER = "select * from user";
    @Resource
    private DatabaseClient databaseClient;

    /**
     * Client web flux flux.
     *
     * @return the flux
     */
    @GetMapping("/allUser")
    public Flux<UserDto> clientWebFlux() {
        return databaseClient.sql(SELECT_FROM_USER).map(this::buildUser).all();
    }

    /**
     * Build user user dto.
     *
     * @param row
     *            the row
     * @return the user dto
     */
    public UserDto buildUser(Row row) {
        return UserDto.builder().nickName(row.get("nickName", String.class)).role(row.get("role", String.class))
            .mobile(row.get("mobiel", String.class)).build();
    }

}
