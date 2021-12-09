package de.hybris.training.core.customValidation;

import de.hybris.training.core.model.VehicleModel;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class VehicleRegistrationNumberValidation implements ConstraintValidator<VehicleRegistrationNumberValidationInterface, String> {


    @Override
    public void initialize(VehicleRegistrationNumberValidationInterface constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        return  value != null && !value.isEmpty() && value.startsWith("KL");
    }
}