import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator( 7.2, 4.5 );
    }

    @Test
    public void getAdd(){
        assertEquals( 11.7, calculator.sumAdd(), 0.01);
    }

    @Test
    public void getSubtract(){
        assertEquals( 2.7, calculator.sumSubtract(), 0.01);
    }

    @Test
    public void getMultiply(){
        assertEquals( 32.4, calculator.sumMultiply(),0.01);
    }

    @Test
    public void getDivide(){
        assertEquals( 1.6, calculator.sumDivide(), 0.01);
    }

}
