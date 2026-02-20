package com.gla.classes_objects.Constructors;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    void display() {
        System.out.println(rollNumber + " | " + name);
    }
}
