package org.example.builders.data;

import org.example.enums.Gender;
import org.example.models.User;

public class UserBuilder {
    private User user;

    private UserBuilder(){
        user = User.builder().build();
    }
    public static UserBuilder anUser(){
        return new UserBuilder();
    }

    public UserBuilder but(){
        return withDefaultInfo();
    }
    public UserBuilder withDefaultInfo(){
        this.user = User.builder()
                .firstName("Jonathan")
                .lastName("Tester LastName")
                .email("test.automation@gmail.com")
                .gender(Gender.male)
                .phone("1234567890")
                .build();
        return this;
    }

    public UserBuilder withOutEmail(){
        user.setEmail("");
        return this;
    }

    public UserBuilder withOutFirstName(){
        user.setFirstName("");
        return this;
    }

    public UserBuilder withOutLastName(){
        user.setLastName("");
        return this;
    }
    public User build(){
        return this.user;
    }
}
