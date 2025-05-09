package com.ricardo.scalable.ecommerce.platform.libs_common.exceptions;

public class InsufficientStockException extends RuntimeException {
    public InsufficientStockException(String message) {
        super(message);
    }

    public InsufficientStockException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public InsufficientStockException(Throwable cause) {
        super(cause);
    }

}
