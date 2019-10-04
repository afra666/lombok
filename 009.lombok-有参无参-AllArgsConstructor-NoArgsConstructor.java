package p6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    public int id;
    public String name;
}
======================================
package p6;

public class Caller {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.id=1;
        stu1.name="Ubra";

        Student stu2=new Student(2,"Fujy");

        System.out.println(stu1.toString());
        System.out.println(stu2.toString());
    }
}
===========================================
Student(id=1, name=Ubra)
Student(id=2, name=Fujy)
