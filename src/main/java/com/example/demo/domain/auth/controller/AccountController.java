package com.example.demo.domain.auth.controller;

import com.example.demo.domain.auth.model.request.SendOTPRequest;
import com.example.demo.domain.auth.model.response.SendOTPResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name="Account API", description = "계정 관련 API")
@RestController
@RequestMapping("/api/v1/account")
@RequiredArgsConstructor
public class AccountController {

    //Service
    @Operation(
            summary = "Email에 OTP 전송",
            description = "Email에 대해서 OTP를 전송합니다"
    )
    @GetMapping("/make-user/{email}")
    public SendOTPResponse sendOTP(
            @RequestBody @Valid SendOTPRequest request
            ){
    return "test";
    }
}
