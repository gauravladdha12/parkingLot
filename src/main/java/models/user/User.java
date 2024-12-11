package models.user;

import models.BaseModel;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class User extends BaseModel {
    String firstName;
    String lastName;
    String emailAddress;
    String phoneNumber;
    UserType userType;
}
