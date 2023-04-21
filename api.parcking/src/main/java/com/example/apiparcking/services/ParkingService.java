package com.example.apiparcking.services;

import com.example.apiparcking.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class ParkingService {

    private List<Car> parkingLot;

    public ParkingService(){
        this.parkingLot = new ArrayList<>();
    }

    public List<Car> getAllCars() {
        return this.parkingLot;
    }

    public void addCar(Car car){
        this.parkingLot.add(car);
    }
}
