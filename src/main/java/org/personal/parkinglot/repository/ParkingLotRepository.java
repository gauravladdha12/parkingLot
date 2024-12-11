package org.personal.parkinglot.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.personal.parkinglot.exceptions.ObjectAlreadyExistsException;

import org.personal.parkinglot.models.ParkingLot;

public class ParkingLotRepository {

    Map<String, ParkingLot> parkingLotMap = new HashMap<>();

    public void addParkingLot(ParkingLot parkingLot) {
        String id = UUID.randomUUID().toString();
        parkingLot.setId(id);
        parkingLotMap.put(id, parkingLot);
    }
}
