public class SavingAccount extends BankAccount {


    public SavingAccount(int accountNuumber, int age, String openingDate, String modeOfOperation,
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
        //setAvailableBalance(FinalBalance);
        return FinalBalance;

    }

    public  double debit(double amount){
        double FinalBalance = 0;
        FinalBalance = getAvailableBalance() - amount;
        return FinalBalance;
    }

}

