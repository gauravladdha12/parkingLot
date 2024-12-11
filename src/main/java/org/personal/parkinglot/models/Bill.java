package org.personal.parkinglot.models;

import org.personal.parkinglot.models.enums.BillState;
import org.personal.parkinglot.models.gate.ExitGate;
import org.personal.parkinglot.models.user.Operator;

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
