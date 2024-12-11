package org.personal.parkinglot.models.user;

import org.personal.parkinglot.models.ParkingLot;
import org.personal.parkinglot.models.gate.Gate;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Operator extends User {
    String employeeId;
    ParkingLot parkingLot;
    Gate gate;
}
