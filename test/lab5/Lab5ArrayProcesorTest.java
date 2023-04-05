package lab5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lab5ArrayProcesorTest {
    Lb5ArrayProcessor labTest;

    @BeforeEach
    void setUp(){
        labTest= new Lb5ArrayProcessor();
    }
    @Test
    void testFunction1(){
        double []  a ={3,9,1,-6,3,-4,16};
        double expected=16;
        double result=labTest.calculate(a);
        assertEquals(expected,result,1e-2);
    }
    @Test
    void testFunction2(){
    double [] [] a2 ={{1,-2,3,-4},
                      {-3,2,-1,2},
                      {-1,-1,-1,-1}};
    double expected=-3;
    double result=labTest.calculate(a2);
      assertEquals(expected,result,1e-2);
    }


}
