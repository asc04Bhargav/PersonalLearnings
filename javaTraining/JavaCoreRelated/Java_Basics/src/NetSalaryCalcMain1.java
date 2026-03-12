//Printing non-English Character.

public class NetSalaryCalcMain1 {
    public static void main(String[] args) {
        NetSalaryCalculator n1 = new NetSalaryCalculator();
        n1.takeHomeSalary();
        n1 = null;
        n1.takeHomeSalary();
    }
}
