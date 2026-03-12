public class EmpMain1 {
    public static void main(String[] args) {
        PermEmployee p1 = new PermEmployee();

        p1.setEmpNumber(101);
        p1.setEmpName("Mani");
        p1.setAttendance(24);
        p1.setMonthlySalary(30000);
        p1.setInsurance(20000);
        p1.setPf(5000);
        p1.setIncomeTax(3000);

        System.out.println("Now Printing Permanent employee details...");
        System.out.println(p1.getEmpNumber() +" "+ p1.getEmpName()+" "+p1.getAttendance()+" "+p1.getMonthlySalary()+" "+p1.getPf()+" "+p1.getInsurance()+" "+p1.getIncomeTax());

        ContrEmployee c1 = new ContrEmployee();
        c1.setEmpNumber(111);
        c1.setEmpName("smith");
        c1.setAttendance(26);
        c1.setMonthlyPayRate(25000);
        c1.setContractDuration(3);
        c1.setTds(2500);

        System.out.println("Contract Employee Dateils...");
        System.out.println(c1.getEmpNumber()+" "+c1.getEmpName()+" "+c1.getAttendance()+" "+" "+c1.getContractDuration()+" "+c1.getMonthlyPayRate()+" "+c1.getTds());

        EmployeeService.callSalary(p1);
        EmployeeService.callSalary(c1);
    }
}
