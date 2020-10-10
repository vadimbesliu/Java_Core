public class Circle {
    int radius = 4;

    public double calculatePerimeter(int a) {
        double result=0;
        result=2*a*Math.PI;
        return result;

    }
    public double calculateArea(int a){
        double result = 0;
        result = Math.PI* Math.pow(a,2);
        return result;
    }
}