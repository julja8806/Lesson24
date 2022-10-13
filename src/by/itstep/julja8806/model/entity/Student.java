package by.itstep.julja8806.model.entity;

public class Student extends Human {
    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 10;
    private double mark;
    private MarkNote note;

    public Student() {


    }

    public Student(String name, int age, double mark) {
        super(name, age);
        this.mark = mark;
        note = new MarkNote(mark);
    }

    public double getMark() {
        return note.getMark();
    }

    public void setMark(double mark) {
        if (mark >= MIN_MARK && mark <= MAX_MARK) {
            note.setMark(mark);
        }
    }public Student(String name, int age, MarkNote note) {
        super(name, age);
        this.mark = mark;
        note = new MarkNote(mark);
    }

    public MarkNote getNote() {
        return note;
    }

    public void setNote(MarkNote note) {
        this.note = note;
    }

    public String getInfo() {
        return super.getInfo() + "mark = " + mark;
    }
}



