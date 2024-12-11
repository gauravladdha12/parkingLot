package models;

import models.enums.BillState;
import models.gate.ExitGate;
import models.user.Operator;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bill extends BaseModel {
    Ticket ticket;
    ExitGate exitGate;
    Operator operator;
    Double amount;
    BillState billState;
}
