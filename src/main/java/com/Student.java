package com;

public class Student {
    private String name;
    private int age;
    private  Long per;
   // private static Student instance;

    // Private constructor to prevent instantiation from outside the class
    Student() {
    }

    // Public static method to get the single instance of the class
 /*   public static Student getInstance() {
        // Lazily initialize the instance if it's null
        if (instance == null) {
            instance = new Student();
        }
        return instance;
    }*/

    // Getters and setters for name and age

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getPer() {
        return per;
    }

    public void setPer(Long per) {
        this.per = per;
    }
// Other methods as needed

    // Main method to test if objects are singleton
    /*public static void main(String[] args) {
        // Get two instances of Student
        Student student1 = Student.getInstance();
        Student student2 = Student.getInstance();

        // Set some values
        student1.setName("John");
        student1.setAge(20);

        student2.setName("Jane");
        student2.setAge(22);

        // Check if they are referring to the same object
        System.out.println("Are student1 and student2 referring to the same object? " + (student1 == student2));

        // Check their properties
        System.out.println("Student1: Name - " + student1.getName() + ", Age - " + student1.getAge());
        System.out.println("Student2: Name - " + student2.getName() + ", Age - " + student2.getAge());
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", per=" + per +
                '}';
    }
}
