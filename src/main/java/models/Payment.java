package models;

import models.enums.PaymentStatus;
import models.user.User;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Payment extends BaseModel {
    Bill bill;
    Double amount;
    String referenceId;
    User user;
    PaymentStatus paymentStatus;
}
