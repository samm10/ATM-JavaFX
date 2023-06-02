// BankAccount class
// This class has instance variables for the account number, password and balance, and methods
// to withdraw, deposit, check balance etc.

// This class contains methods which you need to complete to make the basic ATM work.
// Tutors can help you get this part working in lab sessions. 

// If you choose the ATM for your project, you should make other modifications to 
// the system yourself, based on similar examples we will cover in lectures and labs.
public class BankAccount
{
    public int accNumber = 0;
    public int accPasswd = 0;
    public int balance = 0;
    public StringBuilder miniStatement = new StringBuilder();

    public BankAccount()
    {
    }
    
    public BankAccount(int a, int p, int b)
    {
        accNumber = a;
        accPasswd = p;
        balance = b;
        miniStatement.append("Account Number : "+a+"\n");
    }

    // withdraw money from the account. Return true if successful, or
    // false if the amount is negative, or less than the amount in the account 
    public boolean withdraw( int amount ) 
    { 
        Debug.trace( "BankAccount::withdraw: amount =" + amount ); 

        // CHANGE CODE HERE TO WITHDRAW MONEY FROM THE ACCOUNT
        if (amount < 0 || balance < amount) {
            miniStatement.append("Failed Withdrawal : "+amount+"\n");
            return false;
        } else {
            balance = balance - amount;  // subtract amount from balance
            miniStatement.append("Withdrawn : "+amount+"\n");
            return true; 
        }
    }
    
    // deposit the amount of money into the account. Return true if successful,
    // or false if the amount is negative 
    public boolean deposit( int amount )
    { 
        Debug.trace( "LocalBank::deposit: amount = " + amount ); 
        // CHANGE CODE HERE TO DEPOSIT MONEY INTO THE ACCOUNT
        if (amount < 0) {
            miniStatement.append("Failed Deposit : "+amount+"\n");
            return false;
        } else {
            balance = balance + amount;  // add amount to balance
            miniStatement.append("Deposit : "+amount+"\n");
            return true; 
        }
    }

    // Return the current balance in the account
    public int getBalance() 
    { 
        Debug.trace( "LocalBank::getBalance" ); 

        // CHANGE CODE HERE TO RETURN THE BALANCE
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accNumber=" + accNumber +
                ", accPasswd=" + accPasswd +
                ", balance=" + balance +
                '}';
    }
}
