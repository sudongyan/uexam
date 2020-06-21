package com.dzonesoft.exam.configuration.spring.security;

import lombok.Data;

/**
 * @author dzonesoft
 */

@Data
public class AuthenticationBean {
    private String userName;
    private String password;
    private boolean remember;
}
