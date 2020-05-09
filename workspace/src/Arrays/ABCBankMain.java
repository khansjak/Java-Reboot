abstract class ManageAccount{
    abstract void OpenAccount();
    abstract void CloseAccount();
}

abstract class BankAccount extends ManageAccount{
    abstract void Deposit();

    abstract void Withdraw();

    abstract void Balance();

    public void message(){
        System.out.println("Welcome to ABC Bank Account");
    }
}

class SavingAccount extends BankAccount {

    @Override
    void Deposit() {
        System.out.println("Deposit in saving account");
    }

    @Override
    void Withdraw() {
        System.out.println("Withdraw for saving account");

    }

    @Override
    void Balance() {
        System.out.println("balance check for saving account");

    }

    @Override
    void OpenAccount() {
        System.out.println("Opening Saving Account");
    }

    @Override
    void CloseAccount() {
        System.out.println("Closing saving account");
    }
}

class CurrentAccount extends BankAccount {

    @Override
    void Deposit() {
        System.out.println("Deposit in current account");

    }

    @Override
    void Withdraw() {
        System.out.println("Withdraw in current account");

    }

    @Override
    void Balance() {
        System.out.println("Balance check  in current account");

    }

    @Override
    void OpenAccount() {
        System.out.println("Opening current Account");

    }

    @Override
    void CloseAccount() {
        System.out.println("Closing current account");

    }
}

public class ABCBankMain {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        CurrentAccount currentAccount = new CurrentAccount();

        savingAccount.Deposit();
        savingAccount.message();
        savingAccount.Withdraw();
        savingAccount.Balance();
        savingAccount.OpenAccount();
        savingAccount.CloseAccount();

        currentAccount.Deposit();
        currentAccount.Withdraw();
        currentAccount.Balance();
        currentAccount.message();
        currentAccount.OpenAccount();
        currentAccount.CloseAccount();

    }

}
