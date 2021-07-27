package com.victortello.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyExchange {

    @Id
    private Long id;
    @Column(name="currency_from")
    private String from;
    @Column(name="currency_to")
    private String to;
    private BigDecimal conversionMultlple;
    private String environment;


    public CurrencyExchange() {
    }

    

    public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultlple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultlple = conversionMultlple;        
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultlple() {
        return conversionMultlple;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setConversionMultlple(BigDecimal conversionMultlple) {
        this.conversionMultlple = conversionMultlple;
    }

    

}
