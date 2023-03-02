package com.example.currencyexchangeservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CurrencyExchange {
    @Id

    private Long id;
    @Column(name="currency_from")
    private String from;
    @Column(name="currency_to")

    private String to;
    private BigDecimal conversionMultiple;
    private String environment;


    public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }
}
