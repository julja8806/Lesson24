package by.itstep.julja8806.controller;

import by.itstep.julja8806.model.entity.Human;
import by.itstep.julja8806.model.entity.Student;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human("Alex", 20);

        System.out.println(human1.getInfo());
        System.out.println(human2.getInfo());
        Student student = new Student("Alex", 20, 9);

        System.out.println(student.getInfo() );

    }
}
