package com.bridgelabz.registerationapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtpVerificationDTO {
    private String emailID;
    private int otp;
}
