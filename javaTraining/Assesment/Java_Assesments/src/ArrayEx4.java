public class ArrayEx4 {
    public static void main(String[] args) {
        objArray();
    }

    public static void objArray(){

//        initializing array of objects
        BankAccount1 bank[]= {
                new BankAccount1(),
                new BankAccount1(),
                new BankAccount1()
        };


//        bank[0]=new BankAccount();
//        bank[1]=new BankAccount();
//        bank[2]=new BankAccount();


        bank[0].accBalance=10000;
        bank[0].custName="Bhargav";
        bank[0].accNumber=12465;

        bank[1].accNumber=3547;
        bank[1].custName="veni";
        bank[1].accBalance=1000;

        bank[2].accNumber=5788;
        bank[2].custName="mani";
        bank[2].accBalance=5000;

//        bank[0].deposit(1000);
//        bank[0].withdrawl(100);
//
//        bank[1].deposit(2000);
//        bank[1].withdrawl(2000);
//
//        bank[2].deposit(200);
//        bank[2].withdrawl(100);

        double temp = bank[0].accBalance;

        for(int i=0; i < bank.length; i++){
            if(bank[i].accBalance > temp){
                temp = bank[i].accBalance;
            }
        }

        System.out.println(temp);

        }

}
