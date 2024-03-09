package org.example;

import java.util.Scanner;

// Измените программу из предыдущего задания так,
// чтобы она обрабатывала исключение NegativeNumberException.
public class ExecptionLesson3 {
    public static void main(String[] args) throws NegativeNumberException1 {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            number = scanner.nextInt();
            if (number<0){
                throw new NegativeNumberException("Нельзя вводить отрицательное число");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class  NegativeNumberException1 extends Exception {

    public NegativeNumberException1(String message) {
        super(message);
    }
}


