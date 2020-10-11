package Task2_Java_OOP;

public class Student {
    String name;
    int age;

    public  void setData(String a,int b){
        this.name=a;
        this.age=b;
    }
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        double average=0;
        s1.setData("Valera",24);
        s2.setData("Tolea",16);
        average=(s1.age+s2.age)/2;
        System.out.println(average);
    }



}
