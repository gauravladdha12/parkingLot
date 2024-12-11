package org.personal.parkinglot.models.gate;

import org.personal.parkinglot.models.BaseModel;
import org.personal.parkinglot.models.Floor;
import org.personal.parkinglot.models.user.Operator;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class Gate extends BaseModel {
    String id;
    GateType gateType;
    Floor floor;
    Operator operator;
}
