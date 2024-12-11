package org.personal.parkinglot.models;

import org.personal.parkinglot.models.enums.ParkingStatus;
import org.personal.parkinglot.models.enums.SlotType;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Slot extends BaseModel {
    int slotNumber;
    SlotType slotType;
    Floor floor;
    ParkingStatus slotStatus;
    Vehicle vehicle;
}
