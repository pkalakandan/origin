package com.example.origincodesample.controller;

import com.example.origincodesample.Exception.InvalidRequestException;
import com.example.origincodesample.dto.PaymentDto;
import com.example.origincodesample.mapper.PaymentMapper;
import com.example.origincodesample.service.PaymentService;
import com.example.origincodesample.validator.PaymentBusinessValidator;
import com.pk.origin.api.PaymentApi;
import com.pk.origin.models.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentsController implements PaymentApi {
    @Autowired
    private PaymentService paymentService;

    @Autowired
    private PaymentMapper paymentMapper;

    @Autowired
    private PaymentBusinessValidator paymentBusinessValidator;

    @Override
    public ResponseEntity<Payment> payment(Payment body) {
        final PaymentDto paymentDto = paymentMapper.mapRequestToDto(body);
        validate(paymentBusinessValidator, paymentDto);
        paymentService.savePayment(paymentDto);
        return new ResponseEntity<>(paymentMapper.mapDtoToResponse(paymentDto), HttpStatus.OK);
    }

    public void validate(final org.springframework.validation.Validator validator, final Object toValidate) {

        final DataBinder binder = newBinderInstance(toValidate);
        binder.setValidator(validator);
        binder.validate();

        final BindingResult bindingResult = binder.getBindingResult();
        if (bindingResult.hasErrors()) {
            throw new InvalidRequestException(bindingResult);
        }
    }

    protected DataBinder newBinderInstance(final Object toValidate) {

        final DataBinder binder = new DataBinder(toValidate);
        return binder;
    }
}
