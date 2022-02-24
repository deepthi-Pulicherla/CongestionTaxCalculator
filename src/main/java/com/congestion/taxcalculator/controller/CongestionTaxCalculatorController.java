package com.congestion.taxcalculator.controller;

import com.congestion.taxcalculator.model.*;
import com.congestion.taxcalculator.service.CongestionTaxCalculatorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tax")
public class CongestionTaxCalculatorController {
    @Autowired
    CongestionTaxCalculatorService congestionTaxCalculatorService;

    @PostMapping("/calculator")
    public ResponseEntity<TaxCalculatorResponse> taxCalculate(@RequestBody TaxCalculatorRequest request) {

        TaxCalculatorResponse response;
        try {
            int tax = congestionTaxCalculatorService.getTax(request.getVehicle_type(), request.getDates());

            response = new TaxCalculatorResponse(null, tax,
                    "Tax calculated successfully, Vehicle :" + request.getVehicle_type().name() + " Amount : " + tax);
            return new ResponseEntity<TaxCalculatorResponse>(response, HttpStatus.OK);
        } catch (Exception e) {
            response = new TaxCalculatorResponse(e.getLocalizedMessage(), 0,
                    "Tax calculation failed.");
            return new ResponseEntity<TaxCalculatorResponse>(response, HttpStatus.BAD_REQUEST);
        }
    }
}
