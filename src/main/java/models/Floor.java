package models;

import java.util.List;

import models.enums.ParkingStatus;
import models.gate.Gate;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Floor extends BaseModel {
    List<Slot> slots;
    int floorNumber;
    List<Gate> gates;
    ParkingStatus floorStatus;
}
