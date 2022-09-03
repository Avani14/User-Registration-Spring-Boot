package com.bridgelabz.registerationapp.util;

import org.springframework.stereotype.Component;

@Component
public class OTPGeneration {
    public int generateOTP(){
        return (int)Math.floor(Math.random()*(9999-1000+1)+1000);
    }
}
