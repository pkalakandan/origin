package com.example.origincodesample.mapper;

import com.example.origincodesample.dto.PaymentDto;
import com.pk.origin.models.Payment;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PaymentMapperTest {

    @InjectMocks
    @Spy
    private PaymentMapperImpl mapper;

    @Test
    public void testMapRequestToDto() {

        Payment payment = new Payment();
        payment.setAmount(Double.valueOf(250));
        final PaymentDto paymentDto = mapper.mapRequestToDto(payment);
        Assertions.assertThat(paymentDto.getAmount().equals(Double.valueOf(250)));
    }

}
