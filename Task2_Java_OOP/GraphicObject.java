package Task2_Java_OOP;

import java.awt.*;

public abstract class GraphicObject {
    public abstract double area(int a);


    public static void main(String[] args) {
        Circle c=new Circle();
        Square s=new Square();
        System.out.println(c.area(c.radius));
        System.out.println(s.area(s.sideLength));
    }
    

}
