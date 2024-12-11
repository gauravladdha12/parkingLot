package org.personal.parkinglot.bo;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class CreateParkingLotRequestBO {
    String address;
    int numberOfFloors;

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(final int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
