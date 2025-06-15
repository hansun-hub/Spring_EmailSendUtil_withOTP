package com.example.demo.common.constraints;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Constrants {
    public static final String COMMON_MAIL_SENDER = "hansun33@naver.com";

    public static final String OTP_ISSUER = "hansun";
    public static final String QR_SERVER = "https://api.qrserver.com/v1/create-qr-code/?size=200x200&data=otpauth://totp/%s:%s?secret=%s&issuer=%s";
    public static final String INVITE_QR_TEMPLATE = "invite-opt-code";
    public static final String SECRET = "SECRET";


}
