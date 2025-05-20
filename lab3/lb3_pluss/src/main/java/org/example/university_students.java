package org.example;

public class university_students extends students{
    String faculty;
    int major; //специальность
    int group_number;

    public university_students(String FIO, int age, String sex, String faculty, int major, int group_number) {
        super(FIO, age, sex);
        this.faculty =faculty;
        this.major = major;
        this.group_number = group_number;
    }

    public String getFaculty(){return  faculty;}
    public int getMajor(){return  major;}
    public  int getGroup_number(){return  group_number;}

    @Override
    public String educationalInstitution() {
        return "Университет";

    }
}
