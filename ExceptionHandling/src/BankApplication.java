import javax.naming.InsufficientResourcesException;

public class BankApplication {
double balance;
//bank a/c with zero balance
public BankApplication() {
	balance=0;
}
//bank a/c with given balance
public BankApplication(double initialbalance) {
	balance=initialbalance;
}
public void deposit(double amount) {
	balance=balance+amount;
}
public void withdraw(double amount) throws Throwable {
	if(amount>balance)
	{
		throw new InsufficientResourcesException("amount exceeds balance");
	}
	else if(amount<0) {
		throw new IllegalAccessException("Amount is under zero");
	}
	balance=balance-amount;
}
public double getbalance()
{
	return balance;
}
}
class ThrowingExceptions{
	public static void main(String[] args) {
		BankApplication checking=new BankApplication();
		checking.deposit(2000);
		try {
			checking.withdraw(-2100);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(checking.getbalance());
	}
}