package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    // @Test
    // public void testSum(){
    //     Calculate calculate = new Calculate();
    //     int expected = 5;
    //     assertEquals(expected, calculate.sum(2,3));
    // }
    @Test
    public void calcTest(){
        Calculate calculate = new Calculate();
        // sum
        int expected_1 = 5;
        assertEquals(expected_1, calculate.sumall(2,3));
        // average
        double expected_2 = 2.5;
        assertEquals(String.valueOf(expected_2), String.valueOf(calculate.average(2, 3)));
        // sumodd
        int expected_3 = 25;
        assertEquals(expected_3, calculate.sumodd(1,10));
        //sumeven
        int expected_4 = 30;
        assertEquals(expected_4, calculate.sumeven(1,10));
    }

}
