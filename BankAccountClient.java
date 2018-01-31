
public class BankAccountClient {
	public static void main (String[] args) {
		BankAccount B1 = new BankAccount("John", 500);
		System.out.println(B1);
		
		B1.deposit(500);
		System.out.println(B1);
		
		B1.withdraw(300);
		System.out.println(B1);

		BankAccount B2 = new BankAccount();
		B2.setName("Theo");
		B2.setBalance(600);
		System.out.println(B2);
		
		
	}
}
