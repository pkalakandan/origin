package com.example.origincodesample.service;

import com.example.origincodesample.dto.PaymentDto;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService{
    @Override
    public PaymentDto savePayment(PaymentDto in) {
        return in;
    }
}
