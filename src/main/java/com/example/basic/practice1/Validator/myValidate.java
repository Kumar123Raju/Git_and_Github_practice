package com.example.basic.practice1.Validator;

import com.example.basic.practice1.Dto.myDto;
import org.springframework.stereotype.Component;

@Component
public class myValidate {

    public boolean validate(myDto mydto){
        System.out.println("This is my valiation method:");
           if(mydto.getName().isBlank() && mydto.getName().isEmpty()) return true;
           else return false;
    }


}
