package lab5;

import lab5.LabDoubleArrayReader;
import lab5.Lb5ArrayProcessor;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        double [] array;
        double [] calculator;

        Lb5ArrayProcessor lb5ArrayProcessor= new Lb5ArrayProcessor();
        LabDoubleArrayReader labDoubleArrayReader=new LabDoubleArrayReader();

        double [][] array2;
        double [][] calculator2;

   while (choice != 5){
       System.out.println("Оберіть один з пунктів меню:");
       System.out.println("1.Вивести елементи з першого файлу на екран");
       System.out.println("2.Знайти найбільше додатнє число");
       System.out.println("3.Вивести матрицю елементів другого файлу на екран");
       System.out.println("4.Розрахувати суму від'ємних елементів виділеної дільниці");
       System.out.println("5.Вихід з програми");
       choice=scanner.nextInt();

       switch (choice){
           case 1 ->{
               System.out.println("1");
               array=labDoubleArrayReader.readOneDimensionalArray("lab51.txt");
               lb5ArrayProcessor.processArray(array);
           }
           case 2 ->{
               System.out.println("2.");
               calculator=labDoubleArrayReader.readOneDimensionalArray("lab51.txt");
               double max = lb5ArrayProcessor.calculate(calculator);
               System.out.println(max);
           }
           case 3 ->{
               System.out.println("3.");
               array2=labDoubleArrayReader.readTwoDimensionalArray("lab52.txt");
               lb5ArrayProcessor.processArray(array2);
           }
           case 4 -> {
               System.out.println("4.");
               File file = new File("lab52.txt");
               calculator2=labDoubleArrayReader.readTwoDimensionalArray(file);
               double sum = lb5ArrayProcessor.calculate(calculator2);
               System.out.println(sum);

           }
           case 5 -> System.out.println("Вихід з програми");
           default -> System.out.println("Помилка.Спробуйте ще раз");
       }
   }
    }
}


