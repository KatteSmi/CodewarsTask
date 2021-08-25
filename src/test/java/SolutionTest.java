import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.math.BigInteger;


public class SolutionTest {

    @Test
    public void simpleTest() {
        assertEquals(BigInteger.valueOf(4),  Cable.calculateLength("----"));
        assertEquals(BigInteger.valueOf(6), Cable.calculateLength("-__-"));
        assertEquals(BigInteger.valueOf(9), Cable.calculateLength("-_=_-"));
        assertEquals(BigInteger.valueOf(4), Cable.calculateLength("(--)"));
        assertEquals(BigInteger.valueOf(6), Cable.calculateLength("(-_)"));
        assertEquals(BigInteger.valueOf(8), Cable.calculateLength("_(-_)"));
    }


    @Test
    public void harderTest(){
        assertEquals(BigInteger.valueOf(15), Cable.calculateLength("_(-(_))="));
        assertEquals(BigInteger.valueOf(33), Cable.calculateLength("_((=)((-))(_))="));
    }

}