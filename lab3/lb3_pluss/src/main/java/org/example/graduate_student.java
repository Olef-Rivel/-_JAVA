package org.example;

public class graduate_student extends students {
    String scientific_work_name;
    String getScientific_manager;


    public graduate_student(String FIO, int age, String sex, String scientific_work_name, String getScientific_manager) {
        super(FIO, age, sex);
        this.scientific_work_name = scientific_work_name;
        this.getScientific_manager = getScientific_manager;

    }

    public String getScientific_work_name(){return scientific_work_name;}
    public String getGetScientific_manager(){return  getScientific_manager;}

    @Override
    public String educationalInstitution() {
        return "Аспирантура";
    }
}
