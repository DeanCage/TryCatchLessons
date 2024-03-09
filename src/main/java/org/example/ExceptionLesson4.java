package org.example;
import java.io.*;

// Напишите программу для чтения содержимого файла и вывода его в консоль.
// Обработайте исключение, если файл не найден или не удается прочитать содержимое файла.
public class ExceptionLesson4 {
    public static void main(String[] args) {
        File file = new File("text.tx.t");
        try {
            InputStream inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
