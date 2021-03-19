package main.java.ua.com.hometask;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface Calculator {

    BigDecimal summary(BigDecimal a, BigDecimal b);
    BigDecimal subtraction(BigDecimal a, BigDecimal b);
    BigDecimal devide(BigDecimal a, BigDecimal b);
    BigDecimal multiply(BigDecimal a, BigDecimal b);
    BigDecimal modulDevide(BigInteger a, BigInteger b);
}
