package lab5;

import lab5.ArrayProcessor;

public class Lb5ArrayProcessor implements ArrayProcessor {

    @Override
    public double calculate(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max && arr[i]>0) {
                max = arr[i];
            }
        }
        return max;
    }


    @Override
    public double calculate(double[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                if (i > j && i+j+1<array.length && array[i][j] < 0) {
                    sum += array[i][j];

                }
            }
        }
        return sum;
    }

    @Override
    public void processArray(double[] array) {
        for(double l:array){
            System.out.println(l+" ");
        }
        System.out.println();
        System.out.println();
    }

    @Override
    public void processArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
    }
}