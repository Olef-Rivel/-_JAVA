package org.example;

public class Element {

    private  int value;

    public Element(int value) {
        this.value = value;
    }

    public int getValue(){ //геттер
        return value;
    }


    public Element add(Element other) { //сложение
        return new Element(this.value + other.value);
    }

    public Element subtract(Element other){ //вычитание
        return new Element((this.value - other.value));
    }

    public Element multiply(Element other) { //умножение
        return  new Element(this.value * other.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
