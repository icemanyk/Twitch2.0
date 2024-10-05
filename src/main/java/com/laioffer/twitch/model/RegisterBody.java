package com.laioffer.twitch.model;


import com.fasterxml.jackson.annotation.JsonProperty;

/* 用来接收前端传过来的信息 */
public record RegisterBody(
        String username,
        String password,
        @JsonProperty("first_name") String firstName,
        @JsonProperty("last_name") String lastName
) {
}
