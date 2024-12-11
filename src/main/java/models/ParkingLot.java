package models;

import java.util.List;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class ParkingLot extends BaseModel {
    String address;
    List<Floor> floors;
}
