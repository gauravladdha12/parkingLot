package org.personal.parkinglot.models;

import java.util.Date;

import org.personal.parkinglot.models.gate.EntryGate;
import org.personal.parkinglot.models.user.Operator;
import org.personal.parkinglot.models.user.User;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ticket extends BaseModel {
    Slot slot;
    User user;
    Vehicle vehicle;
    Operator operator;
    Date entryTime;
    EntryGate entryGate;
}
