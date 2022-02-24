package com.congestion.taxcalculator.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@ConfigurationProperties(prefix = "tax-exempt")
@Getter
@Setter
public class TaxExempt {

    private Set<String> vehicles;

}
