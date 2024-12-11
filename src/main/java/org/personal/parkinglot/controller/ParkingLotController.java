package org.personal.parkinglot.controller;

import org.personal.parkinglot.bo.CreateParkingLotRequestBO;
import org.personal.parkinglot.dto.CreateParkingLotRequest;
import org.personal.parkinglot.dto.CreateParkingLotResponse;
import org.personal.parkinglot.exceptions.InvalidInputException;
import org.personal.parkinglot.models.ParkingLot;
import org.personal.parkinglot.service.ParkingLotService;

public class ParkingLotController {

    ParkingLotService parkingLotService;

    public ParkingLotController(final ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    public CreateParkingLotResponse createParkingLot(CreateParkingLotRequest request) throws InvalidInputException {
        // basic validations regarding entities.
        if (request.getAddress() == null) {
            throw new InvalidInputException("Address cannot be null");
        }
        ParkingLot parkingLot = parkingLotService.createParkingLot(getCreateParkingLotRequestBO(request));
        return CreateParkingLotResponse.builder()
                .parkingLot(parkingLot).build();
    }

    private static CreateParkingLotRequestBO getCreateParkingLotRequestBO(final CreateParkingLotRequest request) {
        return CreateParkingLotRequestBO.builder()
                .address(request.getAddress()).numberOfFloors(request.getNumberOfFloors()).build();
    }
}
