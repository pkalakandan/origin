package com.example.origincodesample.controller;

import com.example.origincodesample.dto.PaymentDto;
import com.example.origincodesample.mapper.PaymentMapper;
import com.example.origincodesample.service.PaymentService;
import com.pk.origin.api.PaymentApi;
import com.pk.origin.models.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentsController implements PaymentApi {
    @Autowired
    private PaymentService paymentService;

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public ResponseEntity<Payment> payment(Payment body) {
        final PaymentDto paymentDto = paymentService.savePayment(paymentMapper.mapRequestToDto(body));
        return new ResponseEntity<>(paymentMapper.mapDtoToResponse(paymentDto), HttpStatus.OK);
    }
}
