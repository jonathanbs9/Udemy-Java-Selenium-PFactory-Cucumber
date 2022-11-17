package org.example.tasks;

import org.example.enums.Gender;
import org.example.models.User;
import org.example.pageObjects.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSignUp {
    @Autowired
    private SignUpService signUpService;

    public void withInfo(User user){
        signUpService.writeFirstName(user.getFirstName());
        signUpService.writeLastName(user.getLastName());
        signUpService.writeEmail(user.getEmail());
        signUpService.writePhone(user.getPhone());
        //signUpService.selectGenderMale();
        signUpService.selectGender(user.getGender());

        //signUpService.clickSubmit();

    }


}
