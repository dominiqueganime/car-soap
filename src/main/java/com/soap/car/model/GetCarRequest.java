package com.soap.car.model;

import lombok.*;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "brand"
})
@XmlRootElement(name = "getCarRequest")
public class GetCarRequest {

    @XmlElement(required = true)
    protected String brand;
}
