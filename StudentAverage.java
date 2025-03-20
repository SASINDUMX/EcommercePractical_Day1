class Student {
    private String name;
    private int marks;

    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public int getMarks(){
        return marks;
    }
}

public class StudentAverage {
    public static void main(String[] args){
        Student student1 = new Student("A", 85);
        Student student2 = new Student("B", 90);
        Student student3 = new Student("C", 78);
        Student student4 = new Student("D", 92);
        Student student5 = new Student("E", 88);

        Student[] students = {student1, student2, student3, student4, student5};

        int totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.getMarks();
        }
        double averageMarks = totalMarks / (double) students.length;

        System.out.println("Average marks: " + averageMarks);
    }
}