package p6;

public class Student {
    public int id;
    public String name;
    public Student(){}
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

===============================
package p6;

public class Caller {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.id=1;
        stu1.name="Gorge";

        Student stu2=new Student(2,"Jann");

        System.out.println(stu1.toString());
        System.out.println(stu2.toString());
    }
}
===============================
Student{id=1, name='Gorge'}
Student{id=2, name='Jann'}
