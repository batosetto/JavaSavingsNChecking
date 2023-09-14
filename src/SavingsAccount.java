
public class SavingsAccount extends Account{
    
    double interestRate;
    
    public SavingsAccount(int accountNumber, String accountHolder, double interestRate){
        super(accountNumber, accountHolder);
        this.interestRate = interestRate;
    }
    
    public void addInterest(){
        
        double newBalance = getBalance() + getBalance()*interestRate / 100;
        setBalance(newBalance);
    }
    
}
