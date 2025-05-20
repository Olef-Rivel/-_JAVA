package org.example;

public class school_students extends students {

    int class_number;
    String class_letter;

    public school_students(String FIO, int age, String sex, int class_number, String class_letter) {
        super(FIO, age, sex);
        this.class_letter = class_letter;
        this.class_number = class_number;
    }

    public  int getClass_number(){return  class_number;}
    public String getClass_letter(){return class_letter;}

    @Override
    public String educationalInstitution() {
        return "Школа";
    }
}
