package org.example;

// Создайте собственное исключение FileNotFoundException и используйте
// его для обработки случая, когда файл не найден.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionLesson5  {
    public static void main(String[] args) throws FileNotFoundException2 {


        File file = new File("text.tx.t");
        try {
            InputStream inputStream = new FileInputStream(file);
        } catch (Exception e) {
            throw new FileNotFoundException2("нету файла");
        }
    }
}
class FileNotFoundException2 extends Exception {
    public FileNotFoundException2(String message) {
        super(message);
    }
}
