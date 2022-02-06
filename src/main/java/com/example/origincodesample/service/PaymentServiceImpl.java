package com.example.origincodesample.service;

import com.example.origincodesample.dto.PaymentDto;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Timestamp;
import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService{
    @Override
    public PaymentDto savePayment(PaymentDto in)  {
        StatefulBeanToCsv<PaymentDto> beanToCsv = null;
        in.setTotalAmount(calculateGst(in.getAmount()));
        try {
            Writer w = new FileWriter("payment-" + new Timestamp(System.currentTimeMillis()) + "-" + UUID.randomUUID() + ".csv");
            beanToCsv = new StatefulBeanToCsvBuilder(w)
                    .withQuotechar(CSVWriter.DEFAULT_ESCAPE_CHARACTER)
                    .build();
            beanToCsv.write(in);
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvRequiredFieldEmptyException e) {
            e.printStackTrace();
        } catch (CsvDataTypeMismatchException e) {
            e.printStackTrace();
        }
        return in;
    }

    private Double calculateGst(Double amount) {
        return amount + (amount+100/100);
    }


}
