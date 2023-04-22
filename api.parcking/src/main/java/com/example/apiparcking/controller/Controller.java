package com.example.apiparcking.controller;

import com.example.apiparcking.entities.Car;
import com.example.apiparcking.services.ParkingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/parking")
@RestController
public class Controller {

    private final ParkingService parkingService;

    public Controller(ParkingService parkingService){
        this.parkingService = parkingService;
    }
    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getAllCars(){
        return ResponseEntity.ok(this.parkingService.getAllCars();
    }
    @PostMapping ("/cars")
    public ResponseEntity<Car> addCar(Car car){
        this.parkingService.addCar(car);
        return new ResponseEntity<>(car, HttpStatus.CREATED);
    }
}
