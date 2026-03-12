public class BankingOperationsImpl implements IBankingOperations{


    public void deposit(BankAccount bankAccount, int depositAmount) throws AccountNotFoundException {
        if (bankAccount.getActNumber() == 1234){
            bankAccount.setActBalance(bankAccount.getActBalance() + depositAmount);
            System.out.println("Amount Deposited Successfully");
            System.out.println("Now Your Account Balance is: "+bankAccount.getActBalance() );
        }else {
//            System.out.println("Account Not Found");
            throw new AccountNotFoundException(bankAccount.getActNumber());
        }

    }


    public void withDraw(BankAccount bankAccount, int withDrawAmount) throws AccountNotFoundException {
        if (bankAccount.getActNumber() == 1234){
            if (bankAccount.getActBalance() > withDrawAmount){
                System.out.println("Withdraw Successful");
                bankAccount.setActBalance(bankAccount.getActBalance() - withDrawAmount);
//                System.out.println("Now Your Account Balance is: "+bankAccount.getActBalance() );

            }else {
//                System.out.println("Account Not Found");
                throw new InSufficientFundsException(withDrawAmount);
            }
        } else {
            throw new AccountNotFoundException(bankAccount.getActNumber());
        }

    }


    public void showBalance(BankAccount bankAccount) throws AccountNotFoundException {
        if (bankAccount.getActNumber() == 1234){
            System.out.println("Your Account Balance is: "+bankAccount.getActBalance());
        }else {
//            System.out.println("Account Not found");
            throw new AccountNotFoundException(bankAccount.getActNumber());
        }

    }


    public void transferFunds(BankAccount accountSource, BankAccount accountTarget, int transferAmount) throws AccountNotFoundException {
        if (accountSource.getActNumber() == 1234){
            if (accountTarget.getActNumber() == 4567){
                if (accountSource.getActBalance() > transferAmount){
                    System.out.println(transferAmount + " is transferred to Target Account");
                    accountSource.setActBalance(accountSource.getActBalance() - transferAmount);
                    accountTarget.setActBalance(accountTarget.getActBalance() + transferAmount);
                    System.out.println("Balance on your source account is :" + accountSource.getActBalance());
                    System.out.println("Balance on your Target account is :" + accountTarget.getActBalance());

                } else {
                    throw new InSufficientFundsException(transferAmount);
                }

            }else {
//                System.out.println("Target Account Not Found");
                throw new AccountNotFoundException(accountTarget.getActNumber());
            }
        } else {
//            System.out.println("Source Account Not Found");
            throw new AccountNotFoundException(accountSource.getActNumber());
        }
    }
}
