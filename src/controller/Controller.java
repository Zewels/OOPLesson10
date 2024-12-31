package controller;

import model.EducationalGroup;
import model.Student;
import model.Teacher;
import model.Type;
import model.User;
import service.DataService;
import service.EducationalGroupService;
import view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    // Создание экземпляров сервисов и вида
    private final DataService dataService = new DataService();
    private final EducationalGroupService groupService = new EducationalGroupService();
    private final StudentView view = new StudentView();

    // Метод для создания студента
    public void createStudent(String firstName, String lastName, String middleName) {
        // Вызываем метод для создания студента в сервисе данных
        dataService.create(firstName, lastName, middleName, Type.STUDENT);
    }

    // Метод для получения всех студентов и вывода их на экран
    public void getAllStudents() {
        // Получаем список всех студентов из сервиса данных
        List<User> userList = dataService.getAllStudents();

        // Проходим по каждому пользователю, проверяем, что это студент, и выводим его информацию
        for (User user : userList) {
            Student student = (Student) user; // Приводим объект к типу Student
            view.printOnConsole(student); // Выводим информацию о студенте на консоль
        }
    }

    // Метод для создания учебной группы
    public EducationalGroup createEducationalGroup(int teacherId, List<Integer> studentIds) {
        // Получаем преподавателя по ID
        Teacher teacher = (Teacher) dataService.getUserById(model.Type.TEACHER, teacherId);

        // Создаем список студентов по их ID
        List<Student> students = new ArrayList<>();
        for (int id : studentIds) {
            // Получаем каждого студента по ID и добавляем в список
            Student student = (Student) dataService.getUserById(model.Type.STUDENT, id);
            students.add(student);
        }

        // Формируем и возвращаем учебную группу с преподавателем и студентами
        return groupService.createGroup(teacher, students);
    }
}
