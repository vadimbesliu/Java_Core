package Task2_Java_OOP;

public class UseEmployee {
    public static void main(String[] args) {
        Employee e=new Employee();
        System.out.println("Tariff per Hours: "+ e.getTariffPerHour());
        System.out.println("Salary of an employee: " + e.getSalary());
        Manager m=new Manager();
        System.out.println("Tariff per Hours: "+ e.getTariffPerHour());
        System.out.println("Salary of the manager: " + m.getSalary());
    }
}
