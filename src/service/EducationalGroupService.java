package service;

import model.EducationalGroup;
import model.Student;
import model.Teacher;

import java.util.List;

public class EducationalGroupService {

    // Метод для создания учебной группы с преподавателем и списком студентов
    public EducationalGroup createGroup(Teacher teacher, List<Student> students) {
        // Создаем и возвращаем новую учебную группу, передавая преподавателя и студентов
        return new EducationalGroup(teacher, students);
    }
}
