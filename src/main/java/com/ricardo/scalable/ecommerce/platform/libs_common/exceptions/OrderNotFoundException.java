package com.ricardo.scalable.ecommerce.platform.libs_common.exceptions;

public class OrderNotFoundException extends RuntimeException {;

    public OrderNotFoundException(String message) {
        super(message);
    }

    public OrderNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderNotFoundException(Throwable cause) {
        super(cause);
    }

}
