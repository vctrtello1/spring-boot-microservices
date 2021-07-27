package com.victortello.microservices.currencyexchangeservice;

import java.math.BigDecimal;

public class CurrencyExchange {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMulitple;
    private String enviroment;

    public CurrencyExchange() {
    }

    public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMulitple) {
        this.setId(id);
        this.setFrom(from);
        this.setTo(to);
        this.setConversionMulitple(conversionMulitple);
    }

    public BigDecimal getConversionMulitple() {
        return conversionMulitple;
    }

    public void setConversionMulitple(BigDecimal conversionMulitple) {
        this.conversionMulitple = conversionMulitple;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnviroment() {
        return enviroment;
    }

    public void setEnviroment(String enviroment) {
        this.enviroment = enviroment;
    }

}
