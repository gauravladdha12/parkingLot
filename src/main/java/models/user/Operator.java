package models.user;

import models.ParkingLot;
import models.gate.Gate;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Operator extends User {
    String employeeId;
    ParkingLot parkingLot;
    Gate gate;
}
