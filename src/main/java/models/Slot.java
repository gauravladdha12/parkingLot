package models;

import models.enums.ParkingStatus;
import models.enums.SlotType;

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
