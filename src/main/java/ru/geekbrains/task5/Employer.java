package ru.geekbrains.task5;

public class Employer {

    private String fullName;
    private String position;
    private String pgone;
    private String email;
    private int age;
    private float salary;

    public Employer(String fullName, String position, String pgone, String email, int age, float salary) {
        this.fullName = fullName;
        this.position = position;
        this.pgone = pgone;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getPgone() {
        return pgone;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", pgone='" + pgone + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


}
