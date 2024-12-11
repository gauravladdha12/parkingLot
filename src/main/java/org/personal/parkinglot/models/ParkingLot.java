package org.personal.parkinglot.models;

import java.util.List;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class ParkingLot extends BaseModel {
    String address;
    List<Floor> floors;
}
