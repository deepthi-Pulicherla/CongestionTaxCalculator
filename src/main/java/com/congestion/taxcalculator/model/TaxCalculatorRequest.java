package com.congestion.taxcalculator.model;

import com.congestion.taxcalculator.properties.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;

import java.util.Date;

@ApiModel(description = "All details about the request")
public class TaxCalculatorRequest {

    private Vehicle vehicle_type;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Europe/Amsterdam")
    private Date[] dates;

    public Vehicle getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(Vehicle vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public Date[] getDates() {
        return dates;
    }

    public void setDates(Date[] dates) {
        this.dates = dates;
    }

}
