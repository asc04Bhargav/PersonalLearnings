import java.awt.event.WindowStateListener;

public class NetSalaryCalculator {
    double  actSalary = 150000000;
    double incomeTaxPer = 2.0; //in per
    double pf = 20000;
    double isurance = 5000;

    public void takeHomeSalary(){
        double incomeTax = actSalary - (actSalary*(incomeTaxPer/100));
        double  deductions= incomeTax + pf + isurance;
        double takeHomeSalary = actSalary - deductions;
        System.out.println("takeHomeSalary =" + takeHomeSalary);
        System.out.println("deductions are :" + deductions);
    }
}
