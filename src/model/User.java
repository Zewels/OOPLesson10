package model;

// Абстрактный класс для представления пользователя
public abstract class User {

    // Конструктор, инициализирующий имя, фамилию и отчество пользователя
    public User(String firstName, String lastName, String middleGame) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleGame = middleGame;
    }

    // Поля для хранения имени, фамилии и отчества пользователя
    private String firstName;
    private String lastName;
    private String middleGame;

    // Геттер для получения имени
    public String getFirstName() {
        return firstName;
    }

    // Сеттер для установки имени
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Геттер для получения фамилии
    public String getLastName() {
        return lastName;
    }

    // Сеттер для установки фамилии
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Геттер для получения отчества
    public String getMiddleGame() {
        return middleGame;
    }

    // Сеттер для установки отчества
    public void setMiddleGame(String middleGame) {
        this.middleGame = middleGame;
    }
}