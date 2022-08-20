public class SavingAccountImpl {
    public static void main(String[] args) {

        SavingAccount savingAccount = new SavingAccount(123456789, 17, "20.08.21",
                "SelfOperation",true,2000,800,6);

        RecurringDepositAccount recurringDepositAccount = new RecurringDepositAccount(123456789,18,
                "20.08.21", "SelfOperation",true,1000,800,
                10);

        System.out.println(" Saving account Balance After credit " + savingAccount.credit(100));

        System.out.println("Saving account Balance After  " + savingAccount.debit(100));
        System.out.println("Recuuring  account Balance After credit " + recurringDepositAccount.credit(100));
        System.out.println("Recuuring  account Balance After debit " + recurringDepositAccount.debit(100));
        System.out.println(savingAccount.checkAge());
        System.out.println(recurringDepositAccount.checkAge());
    }
}
