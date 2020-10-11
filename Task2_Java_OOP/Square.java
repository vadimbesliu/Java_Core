package Task2_Java_OOP;

public class Square extends GraphicObject {
    int sideLength=14;
    public int calculateArea(int a){
        int result=0;
        result=a*a;
        return result;
    }
    public int calculatePerimiter(int a){
        int result=0;
        result=a*4;
        return result;
    }

    @Override
    public double area(int a) {
        return sideLength*sideLength;
    }
}
