package org.personal.parkinglot.models;

import org.personal.parkinglot.models.enums.VehicleType;
import org.personal.parkinglot.models.user.User;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicle extends BaseModel {
    String vehicleNumber;
    User user;
    VehicleType vehicleType;
}
