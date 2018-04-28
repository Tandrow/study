package com.bee.study.controller.validate;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = {PasswordErrorValidator.class})
@Documented
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordError {
    String message() default "密码长度为6-20位的字母或数字";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
