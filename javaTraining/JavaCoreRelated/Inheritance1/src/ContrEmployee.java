public class ContrEmployee extends Employee{
    private int contractDuration;
    private double monthlyPayRate;
    private double tds;  //Tax deduced at source

    public void calculateNetSalary(){
        double perdaySalary = monthlyPayRate/30;
        double grossSalary = perdaySalary *getAttendance();
        double netSalary = grossSalary - tds; //tds is only deduction.

        System.out.println("Gross Salary :"+ grossSalary);
        System.out.println("Deductions :" + tds);
        System.out.println("Net Salary :"+ netSalary);
    }
    public ContrEmployee(){

    }

    public ContrEmployee(int contractDuration, double monthlyPayRate, double tds) {
        this.contractDuration = contractDuration;
        this.monthlyPayRate = monthlyPayRate;
        this.tds = tds;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    public double getMonthlyPayRate() {
        return monthlyPayRate;
    }

    public void setMonthlyPayRate(double monthlyPayRate) {
        this.monthlyPayRate = monthlyPayRate;
    }

    public double getTds() {
        return tds;
    }

    public void setTds(double tds) {
        this.tds = tds;
    }
}
