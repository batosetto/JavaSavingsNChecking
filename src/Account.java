
public class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    
    public Account(int accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }
    
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }
    
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
    
    
    
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(123, "Barbara Tosetto", 3.0);
        savings.deposit(1000);
        savings.addInterest();
        System.out.println("Savings Account Info");
        System.out.println("--------------------");
        savings.displayAccountInfo();
        System.out.println();
        
        CheckingAccount checking = new CheckingAccount(123, "Barabara Tosetto");
        checking.deposit(500);
        checking.deductMonthlyFee();
        System.out.println("Checking Account Info ");
        System.out.println("---------------------");
        checking.displayAccountInfo();
        
    }
    
}
