package com.example.origincodesample.service;

import com.example.origincodesample.dto.PaymentDto;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.springframework.stereotype.Service;

import java.io.IOException;


public interface PaymentService {
    PaymentDto savePayment(PaymentDto in) ;
}
