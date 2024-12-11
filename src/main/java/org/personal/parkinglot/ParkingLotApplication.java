package org.personal.parkinglot;

import org.personal.parkinglot.controller.ParkingLotController;
import org.personal.parkinglot.dto.CreateParkingLotRequest;
import org.personal.parkinglot.dto.CreateParkingLotResponse;
import org.personal.parkinglot.exceptions.InvalidInputException;
import org.personal.parkinglot.repository.ParkingLotRepository;
import org.personal.parkinglot.service.ParkingLotService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ParkingLotApplication {

    private static final Logger logger = LoggerFactory.getLogger(ParkingLotApplication.class);

    public static void main(String[] args) throws InvalidInputException {
        SpringApplication.run(ParkingLotApplication.class, args);
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingLotService parkingLotService = new ParkingLotService(parkingLotRepository);
        ParkingLotController parkingLotController = new ParkingLotController(parkingLotService);

        ObjectRegistry.put("parkingLotController", parkingLotController);
        ObjectRegistry.put("parkingLotService", parkingLotService);
        ObjectRegistry.put("parkingLotRepository", parkingLotRepository);

        CreateParkingLotRequest request = CreateParkingLotRequest.builder()
                .numberOfFloors(3)
                .address("Delhi").build();

        CreateParkingLotResponse parkingLot = parkingLotController.createParkingLot(request);
        logger.info("Parking lot address: {}", parkingLot.getParkingLot().getAddress());
    }

}
