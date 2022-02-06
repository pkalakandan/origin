package com.example.origincodesample.mapper;

import com.example.origincodesample.dto.PaymentDto;
import com.pk.origin.models.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper {
    PaymentDto mapRequestToDto(Payment payment);
    Payment mapDtoToResponse(PaymentDto payment);
}
