package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        university_students uniStudent = new university_students("Иванов Иван Иванович", 21, "Мужской", "Физика", 104, 5);
        school_students schoolStudent = new school_students("Петрова Анна Сергеевна", 15, "Женский", 10, "Б");
        graduate_student gradStudent = new graduate_student("Кузнецов Дмитрий Александрович", 26, "Мужской", "Машинное обучение", "Иванов И.И.");

        WriterInfo.printUniversityStudentInfo(uniStudent);
        WriterInfo.printSchoolStudentInfo(schoolStudent);
        WriterInfo.printGraduateStudentInfo(gradStudent);

    }
}