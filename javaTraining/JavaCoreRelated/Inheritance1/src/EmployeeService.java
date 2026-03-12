public class EmployeeService {

    public static void callSalary(Employee e){

        if (e instanceof PermEmployee){
            System.out.println("**Now printing Salary of Permanent Employee**");
        } else if (e instanceof ContrEmployee) {
            System.out.println("**Now Printing Salary of Contract Employee **");
        }

        e.calculateNetSalary();
    }
}
