package org.example;

public class WriterInfo {


        // Метод для вывода общей информации о любом студенте
        public static void printStudentInfo(students student) {
            System.out.println("ФИО: " + student.getFIO());
            System.out.println("Возраст: " + student.getAge());
            System.out.println("Пол: " + student.getSex());
            System.out.println("Учебное заведение: " + student.educationalInstitution());
        }

        // Метод для вывода информации об университете
        public static void printUniversityStudentInfo(university_students uniStudent) {
            printStudentInfo(uniStudent); // Вызов метода для базовой информации
            System.out.println("Факультет: " + uniStudent.getFaculty());
            System.out.println("Специальность (код): " + uniStudent.getMajor());
            System.out.println("Номер группы: " + uniStudent.getGroup_number());
        }

        // Метод для вывода информации о школьниках
        public static void printSchoolStudentInfo(school_students schoolStudent) {
            printStudentInfo(schoolStudent); // Вызов метода для базовой информации
            System.out.println("Класс: " + schoolStudent.getClass_number() + schoolStudent.getClass_letter());
        }

        // Метод для вывода информации о выпускниках (аспирантах)
        public static void printGraduateStudentInfo(graduate_student gradStudent) {
            printStudentInfo(gradStudent); // Вызов метода для базовой информации
            System.out.println("Научная работа: " + gradStudent.getScientific_work_name());
            System.out.println("Научный руководитель: " + gradStudent.getGetScientific_manager());
        }
    }

