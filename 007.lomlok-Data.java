@Data

注解在 类 上；提供类所有属性的 get 和 set 方法，此外还提供了equals、canEqual、hashCode、toString 方法。
=============================
package p4;

import lombok.Data;

@Data
public class Student {
    private String name;
    private int age;
    private int phone;
    private String address;
}
=========================
package p4;

public class Caller {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setName("Mona");
        stu1.setAge(9);
        stu1.setPhone(123456);
        stu1.setAddress("USA");
        System.out.println(stu1.toString());
    }

}
===============================
Student(name=Mona, age=9, phone=123456, address=USA)
