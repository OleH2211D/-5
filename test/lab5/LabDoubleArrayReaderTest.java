package lab5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class LabDoubleArrayReaderTest {
LabDoubleArrayReader labTest;
    @BeforeEach
    void setUp() {
        labTest=new LabDoubleArrayReader();
    }

    @Test
    void readOneDimensionalArray() {
        File file= new File("test.txt");
        int expected =7;
        double [] result = labTest.readOneDimensionalArray(file);
        assertEquals(expected,result.length);
    }

    @Test
    void testReadOneDimensionalArray() {
        File file= new File("test.txt");
        double[] expected ={4, -4, 2, -2, 9,-9, 3};
        double [] result = labTest.readOneDimensionalArray(file);
        assertArrayEquals(expected,result,1e-2);
    }

    @Test
    void readTwoDimensionalArray() {
       File file =new File("test2.txt");
       int expected = 3;
       double[] [] result=labTest.readTwoDimensionalArray(file);
       assertEquals(expected,result.length);
    }

    @Test
    void testReadTwoDimensionalArray() {
        File file =new File("test2.txt");
        double[] [] expected = {{1.0, -2.3, 3.7},
                                {-3.4, 2.8, -1.9},
                                {-1.5, -1.8, -1.4}};
        double[] [] result=labTest.readTwoDimensionalArray(file);
        assertArrayEquals(expected,result);
    }


}

