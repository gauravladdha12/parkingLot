package org.personal.parkinglot.service;

import java.util.ArrayList;
import java.util.List;

import org.personal.parkinglot.bo.CreateParkingLotRequestBO;
import org.personal.parkinglot.models.Floor;
import org.personal.parkinglot.models.ParkingLot;
import org.personal.parkinglot.models.enums.ParkingStatus;
import org.personal.parkinglot.repository.ParkingLotRepository;

public class ParkingLotService {

    ParkingLotRepository parkingLotRepository;

    public ParkingLotService(final ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    public ParkingLot createParkingLot(CreateParkingLotRequestBO createParkingLotRequestBO){
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setAddress(createParkingLotRequestBO.getAddress());
        List<Floor> floors = new ArrayList<>();
        for (int floorNumber = 0; floorNumber < createParkingLotRequestBO.getNumberOfFloors(); floorNumber++) {
            Floor floor = new Floor();
            floor.setFloorNumber(floorNumber + 1);
            floor.setFloorStatus(ParkingStatus.FREE);
            floors.add(floor);
        }

        parkingLot.setFloors(floors);
        parkingLotRepository.addParkingLot(parkingLot);
        return parkingLot;
    }
}
