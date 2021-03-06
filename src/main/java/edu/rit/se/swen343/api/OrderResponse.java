package edu.rit.se.swen343.api;

import java.util.List;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class OrderResponse {
    private final String error;
    private final int orderNumber; 
    private final List<Phone> phonesCreated;
}
