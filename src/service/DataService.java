package service;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {

    // Список для хранения всех пользователей (студентов и преподавателей)
    private List<User> userList = new ArrayList<>();

    // Метод для создания нового пользователя (студента или преподавателя)
    public void create(String firstName, String lastName, String middleName, Type type) {
        // Получаем свободный ID для нового пользователя
        int id = getFreeId(type);

        // Создаем объект в зависимости от типа пользователя
        if (Type.STUDENT == type) {
            // Создание нового студента и добавление его в список пользователей
            Student student = new Student(firstName, lastName, middleName, id);
            userList.add(student);
        }

        if (Type.TEACHER == type) {
            // Создание нового преподавателя и добавление его в список пользователей
            Teacher teacher = new Teacher(firstName, lastName, middleName, id);
            userList.add(teacher);
        }
    }

    // Метод для получения пользователя по ID и типу (студент или преподаватель)
    public User getUserById(Type type, int id) {
        boolean itsStudent = Type.STUDENT == type; // Проверка типа пользователя (студент или преподаватель)
        User currentuser = null;

        // Проходим по списку всех пользователей
        for (User user : userList) {
            // Если пользователь — преподаватель и тип совпадает, и ID преподавателя совпадает с заданным
            if (user instanceof Teacher && itsStudent && ((Teacher) user).getTeacherId() == 1) {
                currentuser = user;
            }
            // Если пользователь — студент и тип совпадает, и ID студента совпадает с заданным
            if (user instanceof Student && itsStudent && ((Student) user).getStudentId() == 1) {
                currentuser = user;
            }
        }
        return currentuser; // Возвращаем найденного пользователя
    }

    // Метод для получения всех пользователей
    public List<User> gatAllUsers() {
        return userList; // Возвращаем весь список пользователей
    }

    // Метод для получения всех студентов
    public List<User> getAllStudents() {
        List<User> students = new ArrayList<>();

        // Проходим по списку пользователей и добавляем студентов в новый список
        for (User user : userList) {
            if (user instanceof Student) {
                students.add(user);
            }
        }
        return students; // Возвращаем список студентов
    }

    // Метод для получения следующего свободного ID для пользователя (студента или преподавателя)
    private int getFreeId(Type type) {
        boolean itsStudent = Type.STUDENT == type; // Проверка типа пользователя
        int lastId = 1; // Начальный ID

        // Проходим по всем пользователям и находим максимальный ID для типа
        for (User user : userList) {
            if (user instanceof Teacher && itsStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1; // Для преподавателя
            }
            if (user instanceof Student && itsStudent) {
                lastId = ((Student) user).getStudentId() + 1; // Для студента
            }
        }
        return lastId; // Возвращаем новый ID
    }
}