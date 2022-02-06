package com.example.origincodesample.service;

import com.example.origincodesample.dto.PaymentDto;
import org.springframework.stereotype.Service;


public interface PaymentService {
    PaymentDto savePayment(PaymentDto in);
}
