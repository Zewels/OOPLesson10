package view;

import model.Student;

public class StudentView {

    // Метод для вывода информации о студенте на консоль
    public void printOnConsole(Student student) {
        // Выводим строковое представление объекта студента на консоль
        System.out.println(student.toString());
    }
}