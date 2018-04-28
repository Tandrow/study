package com.bee.study.controller.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordErrorValidator implements ConstraintValidator<PasswordError, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s == null || s.length() == 0 || s.length() < 6 || s.length() > 20) {
            return false;
        }
        return true;
    }
}
