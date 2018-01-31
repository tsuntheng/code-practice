
public class BankAccount {
	private String name;
	private double balance;
	
	public BankAccount(String n, double bal) {
		this.name = n;
		this.balance = bal;
	}
	
	public BankAccount(){
		name = getName();
		balance = getBalance();
	}
	
	public void deposit(double amount) {
		balance =  balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public void setName(String name) {
		this.name = name;	
		}
	
	public String getName(){
		return name;
		
	}
	
	public String toString() {
		return this.name + ", $" + this.balance;
	}
}
