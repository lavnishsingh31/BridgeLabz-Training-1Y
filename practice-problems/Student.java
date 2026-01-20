// Define the Student class
class Student {
    // Variables
    int id;
    String name;
    int age;

    // Method to display student details
    void displayDetails() {
		String status = "ACTIVE";
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Object creation
        Student student1 = new Student();

        // Assigning values to variables
        student1.id = 101;
        student1.name = "John Doe";
        student1.age = 20;

        // Method call
        student1.displayDetails();
    }
}