package com.example.origincodesample.validator;

import com.example.origincodesample.dto.PaymentDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.validation.BindException;

@ExtendWith(MockitoExtension.class)
public class PaymentBusinessValidatorTest {
    @InjectMocks
    @Spy
    private PaymentBusinessValidator paymentBusinessValidator;

    private BindException errors;

    private PaymentDto requestDTO = new PaymentDto();

    @BeforeEach
    public void setUp() throws Exception {
        requestDTO = new PaymentDto();
        errors = new BindException(requestDTO, "paymentDto");
    }

    @Test
    public void supports() {
        final boolean result = paymentBusinessValidator.supports(PaymentDto.class);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void validateLessAmount() {
        requestDTO.setAmount(Double.valueOf(0));
        paymentBusinessValidator.validate(requestDTO, errors);
        Assertions.assertThat(errors.hasErrors()).isTrue();
    }

    @Test
    public void validateMoreAmount() {
        requestDTO.setAmount(Double.valueOf(100000000));
        paymentBusinessValidator.validate(requestDTO, errors);
        Assertions.assertThat(errors.hasErrors()).isTrue();
    }

    @Test
    public void validateAmount() {
        requestDTO.setAmount(Double.valueOf(10));
        paymentBusinessValidator.validate(requestDTO, errors);
        Assertions.assertThat(errors.hasErrors()).isFalse();
    }
}
