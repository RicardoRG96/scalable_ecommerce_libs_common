package com.ricardo.scalable.ecommerce.platform.libs_common.enums;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum DiscountType {
    PERCENTAGE {
        @Override
        public BigDecimal apply(BigDecimal price, BigDecimal value) {
            BigDecimal percent = value.divide(BigDecimal.valueOf(100));
            BigDecimal discounted = price.subtract(price.multiply(percent));
            return discounted.setScale(0, RoundingMode.HALF_UP);
        }
    },
    AMOUNT {
        @Override
        public BigDecimal apply(BigDecimal price, BigDecimal value) {
            BigDecimal discounted = price.subtract(value).max(BigDecimal.ZERO);
            return discounted.setScale(0, RoundingMode.HALF_UP);
        }
    };

    public abstract BigDecimal apply(BigDecimal price, BigDecimal value);
}
