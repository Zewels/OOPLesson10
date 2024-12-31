package model;

public class Student extends User {

    // Поле для хранения уникального идентификатора студента
    private int studentId;

    // Конструктор, инициализирующий имя, фамилию, отчество и уникальный ID студента
    public Student(String firstName, String lastName, String middleGame, int studentId) {
        super(firstName, lastName, middleGame);  // Вызов конструктора родительского класса User
        this.studentId = studentId;  // Инициализация studentId
    }

    // Геттер для получения идентификатора студента
    public int getStudentId() {
        return studentId;
    }

    // Сеттер для установки идентификатора студента
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Переопределение метода toString для вывода информации о студенте
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +  // Выводим идентификатор студента
                '}';
    }
}
