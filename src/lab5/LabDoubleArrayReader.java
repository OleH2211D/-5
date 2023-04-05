package lab5;

import lab5.DoubleArrayReader;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LabDoubleArrayReader implements DoubleArrayReader {
    @Override
    public double[] readOneDimensionalArray(File file) {
        try (Scanner in = new Scanner(file)) {
            int n = in.nextInt();
            double[] arr = new double[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            return arr;
        } catch (IOException ex) {
            System.err.println("Error reading file");
        }
        return null;


    }

    @Override
    public double[] readOneDimensionalArray(String fileName) {
        return readOneDimensionalArray(new File(fileName));
    }

    @Override
    public double[][] readTwoDimensionalArray(File file) {
        try (Scanner in = new Scanner(file)) {
            int n = in.nextInt();
            double[][] arr = new double[n][n];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = in.nextDouble();
                }

            }
            return arr;
        } catch (IOException ex) {
            System.err.println("Error reading file");
            return null;
        }

    }



    @Override
    public double[][] readTwoDimensionalArray(String fileName) {
       return readTwoDimensionalArray(new File(fileName));


    }
}

