package com.congestion.taxcalculator.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Getter
@NoArgsConstructor
public class TaxCalculatorResponse {

    private String error;
    private int tax;
    private String message;


    public TaxCalculatorResponse(String error, int tax, String message) {
        super();
        this.error = error;
        this.tax = tax;
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public int getTax() {
        return tax;
    }

    public String getMessage() {
        return message;
    }

    /*
     * returns the current timestamp
     */
    public Long getTimestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }

}
