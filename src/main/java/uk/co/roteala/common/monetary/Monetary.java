package uk.co.roteala.common.monetary;

import java.io.Serializable;
import java.math.BigDecimal;

public interface Monetary extends Serializable {
    BigDecimal getValue();

    int sigNum();
}
