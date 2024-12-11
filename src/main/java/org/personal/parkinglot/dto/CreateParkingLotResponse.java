package org.personal.parkinglot.dto;

import org.personal.parkinglot.models.ParkingLot;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
public class CreateParkingLotResponse {
    ParkingLot parkingLot;
}
