package p3;
enum Fruit{
    a,b,c
}
public class Ha {
    public static void main(String[] args) {
        String str1="Hello baby";
        String str2="Hello baby";
        Fruit f=Fruit.b;
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1.equals(str2));
    }
}

======================
388131716
388131716
true
