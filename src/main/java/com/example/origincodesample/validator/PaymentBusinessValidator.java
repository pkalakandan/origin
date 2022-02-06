package com.example.origincodesample.validator;

import com.example.origincodesample.dto.PaymentDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class PaymentBusinessValidator implements org.springframework.validation.Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(PaymentDto.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        PaymentDto request = (PaymentDto) target;

        if(request.getAmount() < 0.01 || request.getAmount() > 2000 ){
            errors.reject("100");
            return;
        }

    }
}
