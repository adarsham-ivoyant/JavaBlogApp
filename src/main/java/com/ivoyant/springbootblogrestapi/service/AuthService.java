package com.ivoyant.springbootblogrestapi.service;

import com.ivoyant.springbootblogrestapi.payload.LoginDto;
import com.ivoyant.springbootblogrestapi.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
