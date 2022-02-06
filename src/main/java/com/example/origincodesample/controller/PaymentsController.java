package com.example.origincodesample.controller;

import com.pk.origin.api.PaymentApi;
import com.pk.origin.models.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentsController implements PaymentApi {
    @Override
    public ResponseEntity<Payment> payment(Payment body) {
        return new ResponseEntity<>(body, HttpStatus.OK);
    }
}
