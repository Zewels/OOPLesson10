// Класс УчебнаяГруппа
package model;

import java.util.List;

public class EducationalGroup {

    // Поля класса: преподаватель и список студентов
    private Teacher teacher;
    private List<Student> students;

    // Конструктор, инициализирующий преподавателя и список студентов
    public EducationalGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    // Геттер для получения преподавателя
    public Teacher getTeacher() {
        return teacher;
    }

    // Сеттер для установки преподавателя
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    // Геттер для получения списка студентов
    public List<Student> getStudents() {
        return students;
    }

    // Сеттер для установки списка студентов
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // Переопределение метода toString для вывода информации о группе
    @Override
    public String toString() {
        return "EducationalGroup{" +
                "teacher=" + teacher +
                ", students=" + students +
                '}'; // Возвращаем строковое представление объекта группы
    }
}