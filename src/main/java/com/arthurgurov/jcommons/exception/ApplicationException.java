package com.arthurgurov.jcommons.exception;

import java.text.MessageFormat;

/**
 * The base class for all application exceptions.
 */
public abstract class ApplicationException extends RuntimeException {

    private final Integer code;

    private final String details;

    public ApplicationException(final Integer code, final String message, final String details) {
        this(code, message, details, null);
    }

    public ApplicationException(final Integer code, final String message, final Throwable cause) {
        this(code, message, null, cause);
    }

    public ApplicationException(final Integer code, final String message, final String details, final Throwable cause) {
        super(message, cause);

        this.code = code;
        this.details = details;
    }

    public Integer getCode() {
        return code;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Error {0,number,#00000000}. {1}", code, getMessage());
    }
}
