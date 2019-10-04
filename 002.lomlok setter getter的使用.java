【lomlok】
======================Caller.java
package p;

public class Caller {
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("France");
        System.out.println(person.getName());
    }
}
==========================Person.java

package p;


import lombok.Getter;
import lombok.Setter;

public class Person {
    @Getter
    @Setter
    private String name;

}

============================pom.xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>mg100401</groupId>
    <artifactId>ma100401</artifactId>
    <version>1.0-SNAPSHOT</version>


    <repositories>
        <repository>
            <id>central</id>
            <name>aliyun maven</name>
            <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
            <layout>default</layout>
            <!-- 是否开启发布版构件下载 -->
            <releases>
                <enabled>true</enabled>
            </releases>
            <!-- 是否开启快照版构件下载 -->
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
        </repository>
    </repositories>
    <dependencies>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.10</version>
        </dependency>
    </dependencies>
</project>


============================【传统写法】==================================
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
