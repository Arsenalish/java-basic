package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1;
        Student student2;
        student1 = new Student(); //참조값 -> x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        student2 = new Student();//참조값 -> x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;
        Student[] students = new Student[]{student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("name:" + students[i].name + " age:" + students[i].age + " grade:" + students[i].grade);
        }

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("name:" + s.name + " age:" + s.age + " grade:" + s.grade);
        }

        for (Student s : students) {
            System.out.println("name:" + s.name + " age:" + s.age + " grade:" + s.grade);
        }
    }
}
