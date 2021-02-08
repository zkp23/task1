package ru.geekbrains.task5;

public class Main {

        public static void main(String[] args) {
            Employer[] employers = new Employer[5];

            final int maxAge = 40;

        for (Employer employer : employers) {
            if (employer.getAge() > maxAge) {
                System.out.println(employer.toString());
            }
        }

        }

}
