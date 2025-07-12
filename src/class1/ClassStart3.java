package class1;

public class ClassStart3 {
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

        System.out.println("name:" + student1.name + " age:" + student1.age + " grade:" + student1.grade);
        System.out.println("name:" + student2.name + " age:" + student2.age + " grade:" + student2.grade);
    }
}
