package models;

import models.enums.VehicleType;
import models.user.User;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicle extends BaseModel {
    String vehicleNumber;
    User user;
    VehicleType vehicleType;
}
