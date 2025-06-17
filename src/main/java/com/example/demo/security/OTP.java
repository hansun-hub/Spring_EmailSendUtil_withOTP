package com.example.demo.security;

import com.example.demo.common.constraints.Constrants;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static com.example.demo.common.constraints.Constrants.OTP_ISSUER;
import static com.example.demo.common.constraints.Constrants.QR_SERVER;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OTP {
    public static String generateQRCodeURL(String email, String secretKey){
        return String.format(
                QR_SERVER,
                URLEncoder.encode(OTP_ISSUER, StandardCharsets.UTF_8),
                URLEncoder.encode(email, StandardCharsets.UTF_8),
                URLEncoder.encode(secretKey, StandardCharsets.UTF_8),
                URLEncoder.encode(OTP_ISSUER, StandardCharsets.UTF_8)
        );
    }
}
