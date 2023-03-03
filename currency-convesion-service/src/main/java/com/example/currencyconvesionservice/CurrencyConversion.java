package com.example.currencyconvesionservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CurrencyConversion {
    private Long id;
    private String from;
    private String to;
    private BigDecimal amount;
    private BigDecimal conversionMultiple;
    private BigDecimal totalCalculate;
    private String environment;
}
