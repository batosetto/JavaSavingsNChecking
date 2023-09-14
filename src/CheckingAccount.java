
public class CheckingAccount extends Account{
    
    private final double MONTHLY_FEE = 5.0;
    
    public CheckingAccount(int accountNumber, String accountHolder){
        super(accountNumber, accountHolder);
    }
    
    public void deductMonthlyFee(){
        super.withdraw(MONTHLY_FEE);
    }
}
