package com.soap.car.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "car", propOrder = {
        "brand",
        "carId",
        "price"
})
public class Car {

    @XmlElement(required = true)
    protected String brand;
    protected int carId;
    protected double price;
}
