package test.com.aditya;

import main.com.aditya.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {

    private MyMath math = new MyMath();

    @Test
    public void calculateSum_testZeroLengthArray(){
        int expectedResult = 0;
        int result = math.calculateSum(new int[]{});
        assertEquals(expectedResult, result);
    }
    @Test
    void calculateSum_ThreeMemberArray(){
        int result = math.calculateSum(new int[]{1,2,3});
        int expectedResult = 6;
        assertEquals(expectedResult, result);
    }
}
