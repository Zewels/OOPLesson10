package model;

public class Teacher extends User {

    // Поле для хранения уникального идентификатора преподавателя
    private int teacherId;

    // Конструктор, инициализирующий имя, фамилию, отчество и уникальный ID преподавателя
    public Teacher(String firstName, String lastName, String middleGame, int teacherId) {
        super(firstName, lastName, middleGame);  // Вызов конструктора родительского класса User
        this.teacherId = teacherId;  // Инициализация teacherId
    }

    // Геттер для получения идентификатора преподавателя
    public int getTeacherId() {
        return teacherId;
    }

    // Сеттер для установки идентификатора преподавателя
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
