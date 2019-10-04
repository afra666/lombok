package p;

public class Student {
    private String name;
    private int age;
    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


//***************************************


package p;

public class Caller {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setName("张三");
        stu1.setAge(6);
        System.out.println(stu1.toString());
    }
}


//*************************输出**************
Student{name='张三', age=6}
