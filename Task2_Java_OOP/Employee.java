public class Employee {
    private double tariffPerHour=5.5;
    public int hours;
    public double getSalary (){
        double result=0;
        result=tariffPerHour*hours;
        return result;
    }

    public double getTariffPerHour() {
        return tariffPerHour;
    }
}
