package com.soap.car.controller;

import com.soap.car.model.GetCarRequest;
import com.soap.car.model.GetCarResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CarController {

    @Autowired
    private com.soap.car.service.CarService CarService;

    @PayloadRoot(namespace = "http://bootcamp.com/",
            localPart = "getCarRequest")
    @ResponsePayload
    public GetCarResponse getCarRequest(@RequestPayload GetCarRequest request) {
        GetCarResponse response = new GetCarResponse();
        response.setCar(CarService.getCars(request.getBrand()));
        return response;
    }
}

