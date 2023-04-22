package com.example.apiparcking.services;

import com.example.apiparcking.entities.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingService {

    private List<Car> parkingLot;

    public ParkingService(){

        this.parkingLot = new ArrayList<>();
    }

    public List<Car> getAllCars() {

        return this.parkingLot;
    }

    public ResponseEntity<Car> addCar(Car car){
        this.parkingLot.add(car);
        return null;
    }
}
