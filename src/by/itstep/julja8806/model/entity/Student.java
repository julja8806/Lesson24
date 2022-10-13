package by.itstep.julja8806.model.entity;

public class Student extends Human {
    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 10;
    private double mark;

    public Student() {

    }

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= MIN_MARK && mark <= MAX_MARK) {
            this.mark = mark;
        }
    }
}
