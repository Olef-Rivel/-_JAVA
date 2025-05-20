package org.example;

public class students{

    String FIO;
    int age;
    String sex;

    public students(String FIO, int age, String sex){
        this.FIO= FIO;
        this.age = age;
        this.sex = sex;
    }

    public String getFIO(){return FIO;}
    public int getAge(){return age;}
    public String getSex(){return  sex;}

    public String educationalInstitution() {
        return "Общее учебное заведение";}


}







