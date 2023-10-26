import java.util.*;
class Shape {
    private int a,b;
    public Shape(){
        a=0;
        b=0;
    }
    public int setValues(int a, int b) {
        this.a=a;
        this.b=b;
        return a;
    }
    public void display() {
        System.out.println(a);
        System.out.println(b);
    }
}
public class MemoryTest{
    public static void main(String args[]) {
        Shape obj1 = new Shape();
        Shape obj2 = new Shape();
        obj1.setValues(3, 2);
        obj2.setValues(4, 5);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        obj1=obj2;
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}