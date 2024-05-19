package com.example.test.model.dto;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student(1, "test1", 1);

        Student student2 = new Student(2, "test2", 2);

        Student student3 = new Student(3, "test3");
        student3.setAge(3);

        System.out.println("student3 = " + student3);

        Employee employee = new Employee(1, "test1", 1);

        /*Employee employee2 = new Employee();
        System.out.println("employee2.getEmployeeName() = " + employee2.getEmployeeName());*/

        System.out.println("employee.getEmployeeName() = " + employee.getEmployeeName());

    }
}
