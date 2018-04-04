package ua.tef.exception;

import ua.tef.error.ValidationError;

public class NotValidInputException extends Exception {
    private ValidationError validationError;

    public NotValidInputException(String message, ValidationError validationError) {
        super(message);
        this.validationError = validationError;
    }

    public ValidationError getValidationError() {
        return validationError;
    }

    public void setValidationError(ValidationError validationError) {
        this.validationError = validationError;
    }
}
