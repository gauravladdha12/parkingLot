package models.gate;

import models.BaseModel;
import models.Floor;
import models.user.Operator;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class Gate extends BaseModel {
    String id;
    GateType gateType;
    Floor floor;
    Operator operator;
}
