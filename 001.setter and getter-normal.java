public class Person {//类名
private String name;//私有属性

    public void setName(String name) {//setter方法用来设置属性值
        this.name = name;//传入值
    }
    public String getName(){//getter传出值
        return this.name;//返回属性值
    }
}

=======================================================

public class Caller {

    public static void main(String[] args) {
        Person person=new Person();
        person.setName("Handy");//设置属性值
        System.out.println(person.getName());//查看getter属性值person.name
    }
}

====================输出
Handy
