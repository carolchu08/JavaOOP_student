package model;

public class Student {
    private String name;
    private String gender;
    private int age;
    private int studentIDNumber;

    public Student(String name, String gender, int age, int studentIDNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentIDNumber = studentIDNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentIDNumber() {
        return studentIDNumber;
    }

    public void setStudentIDNumber(int studentIDNumber) {
        this.studentIDNumber = studentIDNumber;
    }
}
