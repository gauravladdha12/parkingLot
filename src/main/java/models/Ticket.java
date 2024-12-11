package models;

import java.util.Date;

import models.gate.EntryGate;
import models.user.Operator;
import models.user.User;

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
