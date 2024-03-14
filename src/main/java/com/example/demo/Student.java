package com.example.demo;

public class Student {
    private int id;
    private String name;
    private int edad;

    public Student(int id, String name, int edad) {
        this.id = id;
        this.name = name;
        this.edad = edad;
        
    }
    
    //Getters y setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

}
