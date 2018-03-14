package com.arthurgurov.jcommons.exception;

/**
 * An unexpected exception that is not handled by the system.
 * <p>
 * This class should be used as a fallback to wrap an exception that has been thrown without any
 * handling.
 */
public final class UnexpectedException extends ApplicationException {

    private static final Integer CODE = 0;

    private static final String MESSAGE = "Unexpected exception";

    public UnexpectedException() {
        super(CODE, MESSAGE, null, null);
    }

    public UnexpectedException(final String details) {
        super(CODE, MESSAGE, details);
    }

    public UnexpectedException(final Throwable cause) {
        super(CODE, MESSAGE, cause);
    }

    public UnexpectedException(final String details, final Throwable cause) {
        super(CODE, MESSAGE, details, cause);
    }
}
