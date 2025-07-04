package com.example.demo.domain.auth.service;

import com.example.demo.domain.auth.model.request.SendOTPRequest;
import com.example.demo.domain.auth.model.response.SendOTPResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OTPService {

    // Repository

    public SendOTPResponse sendOTP(SendOTPRequest request){
        String email = request.email();

        // 1. 들어오는 요청이 유효한지 ---> validator
        // 2. @Transactional 을 활용한 Tx 처리
        // 3. OTP 전송하기

        return new SendOTPResponse(email);

    }

}
