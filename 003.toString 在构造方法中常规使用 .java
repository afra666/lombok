package p;

public class Student {
    private String name;
    private int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//*************
package p;

public class Caller {
    public static void main(String[] args) {
        Student stu1=new Student("Jack",6);

        System.out.println(stu1.toString());
    }
}


