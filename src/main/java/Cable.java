
import java.math.BigInteger;


public class Cable {

    public static BigInteger calculateLength(String cable) throws RuntimeException {
        int count = 0;
        int k = 1;
        int check_bracket = 0;

        for (int index = 0; index < cable.length(); index++) {

            switch (cable.charAt(index)) {
                case '(': {
                    k *= 2;
                    check_bracket++;
                    break;
                }

                case ')': {
                    k /= 2;
                    check_bracket--;
                    break;
                }

                case '-': {
                    count += k;
                    break;
                }

                case '_': {
                    count += 2 * k;
                    break;
                }

                case '=': {
                    count += 3 * k;
                    break;
                }
            }
        }

        if (!(check_bracket == 0)) {
            throw new RuntimeException("BracketException");
        }
        return BigInteger.valueOf(count);
    }
}

