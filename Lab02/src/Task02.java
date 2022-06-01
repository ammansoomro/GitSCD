
public class Task02 {

	public static void main(String[] args) {
		BankA A = new BankA(1000);
		BankA B = new BankA(1500);
		BankA C = new BankA(2000);
		
		System.out.println("Balance in Bank A: " + A.getBalance());
		System.out.println("Balance in Bank B: " + B.getBalance());
		System.out.println("Balance in Bank C: " + C.getBalance());
	}

}
 class Bank{
	 double getBalance()
	 {
		 return 0;
	 }
}
class BankA extends Bank
{
	double bal;
	BankA(){}
	BankA(double x)
	{
		bal = x;
	}
	double getBalance()
	{
		return bal;
	}
}

class BankB extends Bank
{
	double bal;
	BankB(){}
	BankB(double x)
	{
		bal = x;
	}
	double getBalance()
	{
		return bal;
	}
}

class BankC extends Bank
{
	double bal;
	BankC(){}
	BankC(double x)
	{
		bal = x;
	}
	double getBalance()
	{
		return bal;
	}
}

