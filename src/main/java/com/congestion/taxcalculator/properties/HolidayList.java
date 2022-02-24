package com.congestion.taxcalculator.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "holidays")
@Getter
@Setter
public class HolidayList {

    private List<Hyear> years;
}
