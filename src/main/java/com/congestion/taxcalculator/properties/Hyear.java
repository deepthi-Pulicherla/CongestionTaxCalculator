package com.congestion.taxcalculator.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
@Setter
public class Hyear {

    private int year;
    List<Hmonth> months;

}
