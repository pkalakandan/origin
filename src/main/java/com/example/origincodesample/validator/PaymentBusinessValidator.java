package com.example.origincodesample.validator;

import com.example.origincodesample.dto.PaymentDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import java.time.DayOfWeek;
import java.time.LocalDateTime;


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

        LocalDateTime currentLocalDateTime = LocalDateTime.now();
        final DayOfWeek dayOfWeek = currentLocalDateTime.getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                if(currentLocalDateTime.getHour() < 9 || currentLocalDateTime.getHour() > 17) {
                    errors.reject("400");
                }
                break;
            case FRIDAY:
                if(currentLocalDateTime.getHour() < 8 || currentLocalDateTime.getHour() > 18) {
                    errors.reject("400");
                }
                break;
            case SATURDAY:
            //case SUNDAY:
                errors.reject("200");
                break;

        }
//        if (dayOfWeek.equals(SUNDAY) ||
//                dayOfWeek.equals(DayOfWeek.SATURDAY)){
//            errors.reject("200");
//            return;
//        } else {
//
//        if (dayOfWeek.equals()){
//
//        }

    }
}
