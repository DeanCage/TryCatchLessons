package org.example;

import java.util.Scanner;

// Напишите программу, которая делит два числа,
// введенных пользователем с клавиатуры, и обрабатывает исключение,
// если делитель равен нулю.

public class ExceptionLesson1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int number2 = 0;
        number = scanner.nextInt();
        number2 = scanner.nextInt();
        try {
            int del = number / number2;
            System.out.println(del);
        } catch (Exception e) {
            throw new MyException("Нельзя делить на ноль");
        }
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}