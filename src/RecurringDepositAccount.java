public class RecurringDepositAccount extends BankAccount{

    public RecurringDepositAccount(int accountNuumber, int age, String openingDate, String modeOfOperation,
                                   boolean internetBanking, double totalbalance, double availableBalance,
                                   double rateOfInterest) {
        super(accountNuumber, age, openingDate, modeOfOperation, internetBanking, totalbalance,
                availableBalance, rateOfInterest);
    }

    public String ShowAccountBalance(){


        return " ";
    }

    public double credit(double amount){
        double FinalBalance = 0;
        FinalBalance = getAvailableBalance() + amount;
        return FinalBalance;

    }

    public  double debit(double amount){
        double FinalBalance = 0;
        FinalBalance = getAvailableBalance() - amount;
        return FinalBalance;
    }
}
