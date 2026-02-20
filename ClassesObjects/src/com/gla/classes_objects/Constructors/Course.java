package com.gla.classes_objects.Constructors;

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " | " + duration + " | " + fee +
                " | " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 15000);
        c1.displayCourseDetails();

        Course.updateInstituteName("XYZ Institute");
        c1.displayCourseDetails();
    }
}