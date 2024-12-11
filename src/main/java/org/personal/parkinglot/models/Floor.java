package org.personal.parkinglot.models;

import java.util.List;

import org.personal.parkinglot.models.enums.ParkingStatus;
import org.personal.parkinglot.models.gate.Gate;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Floor extends BaseModel {
    List<Slot> slots;
    int floorNumber;
    List<Gate> gates;
    ParkingStatus floorStatus;
}
