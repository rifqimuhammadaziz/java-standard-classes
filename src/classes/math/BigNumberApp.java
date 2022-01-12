package classes.math;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("10000000000000000000");
        BigInteger b = new BigInteger("10000000000000000000");
        BigInteger c = a.add(b); // BigInteger cannot use a + b

        BigDecimal d = new BigDecimal("90000000000.512");
        BigDecimal e = new BigDecimal("90000000000.512");
        BigDecimal f = d.add(e); // Float

        System.out.println(c);
        System.out.println(f);
    }
}
