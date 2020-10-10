public class Manager extends Employee {
    Employee e=new Employee();
    public double getSalary(){
        double result=0;
        result=e.getSalary()*1.5;
        return result;
    }
}
