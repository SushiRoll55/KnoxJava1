
/**
 * 
 * @author cknox17
 *
 */
public class BankAccount {
	//Static variables
	static int lastAccNum = 0;
	
	//Instance variables
	private double balance;
	private String accName;
	private int accNum;
	private char accountType;
	private double interestRate;
	
	//Constructors
	public BankAccount() {
		interestRate = 0.0; //Not defaulted to 3% because of code check
		lastAccNum++;
		accNum = lastAccNum;
	}
	
	public BankAccount(double balance, String accName, char accountType) {
		this.balance = balance;
		this.accName = accName;
		this.accountType = accountType;
		interestRate = 0.0; //Not defaulted to 3% because of code check
		lastAccNum++;
		accNum = lastAccNum;
	}

	//Instance methods
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public char getAccountType() {
		return accountType;
	}

	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void withdraw(double amount) {
		if (balance - amount < 0) {
			throw new IllegalArgumentException("Insufficient funds to transfer");
		}
		
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void transfer(BankAccount recipientAcc, double amount) {
		recipientAcc.withdraw(amount);
		this.deposit(amount);
	}
	
	public void displayAccountInfo() {
		System.out.println("The account name is: " + accName
					 	 + "\nThe account balance is: " + balance
					 	 + "\nThe account number is: " + accNum
					 	 + "\nThe account interest rate is: " + interestRate);
	}
}
