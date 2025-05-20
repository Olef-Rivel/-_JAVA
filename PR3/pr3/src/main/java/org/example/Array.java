package org.example;

public class Array{

    private Element[] elements;

    public void create(int[] values) {
        elements = new Element[values.length];
        for (int i = 0; i < values.length; i++) {
            elements[i] = new Element(values[i]);
        }
    }

    public void  print(){
        for ( Element element : elements){
            System.out.println(element + "");
        }
        System.out.println();
    }

    public Array performOperation(Array other, String operation) {
        if (elements.length != other.elements.length) {
            throw new IllegalArgumentException("Arrays must be of the same length.");
        }
        Array result = new Array();
        Element[] resultElements = new Element[elements.length];
        for (int i = 0; i < elements.length; i++) {
            switch (operation) {
                case "add":
                    resultElements[i] = elements[i].add(other.elements[i]);
                    break;
                case "subtract":
                    resultElements[i] = elements[i].subtract(other.elements[i]);
                    break;
                case "multiply":
                    resultElements[i] = elements[i].multiply(other.elements[i]);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported operation: " + operation);
            }
        }
        result.elements = resultElements;
        return result;
    }
}

