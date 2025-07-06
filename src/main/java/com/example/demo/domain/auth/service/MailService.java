package com.example.demo.domain.auth.service;

import com.example.demo.common.code.ErrorCode;
import com.example.demo.common.constraints.Constrants;
import com.example.demo.common.exception.CustomException;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.ses.SesClient;
import software.amazon.awssdk.services.ses.model.Destination;
import software.amazon.awssdk.services.ses.model.SendTemplatedEmailRequest;
import software.amazon.awssdk.services.ses.model.SendTemplatedEmailResponse;

import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class MailService {

    private final SesClient sesClient;

    public void sendTemplatedEmail(
        String templateName,
        Map<String, String> templateData,
        String... receivers
    ){
        if (receivers.length == 0) {
            throw new CustomException(ErrorCode.MAIL_RECEIVER_REQUIRED);
        }
        SendTemplatedEmailResponse response = sesClient.sendTemplatedEmail(
                SendTemplatedEmailRequest.builder()
                .source(Constrants.COMMON_MAIL_SENDER)
                .destination(Destination.builder().toAddresses(receivers).build())
                .template(templateName)
                .templateData(new Gson().toJson(templateData))
                .build()
        );

        log.info("send Templated({}) email to : {}", templateName, String.join(",",receivers));

        if (!response.sdkHttpResponse().isSuccessful()){
            throw new CustomException(ErrorCode.MAIL_SEND_FAILED, response.sdkHttpResponse().toString());
        }
    }


}
