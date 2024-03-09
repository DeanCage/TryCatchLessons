package org.example;

import java.util.Scanner;

// Создайте собственное исключение NegativeNumberException,
// которое будет выбрасываться,
// если пользователь пытается ввести отрицательное число.
public class ExceptionLesson2 {
    public static void main(String[] args) throws Exception {
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
class  NegativeNumberException extends Exception {

    public NegativeNumberException(String message) {
        super(message);
    }
}
