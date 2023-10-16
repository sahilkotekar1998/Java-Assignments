package paper;

abstract class Account
{
	abstract void B();
}
class Savings extends Account
{
	void B()
	{
	System.out.println("Done");	
	}
	
}


public class AcDemo {
	static void perform(Account ref)
	{
		Savings s1=(Savings)ref;
		ref.B();
	}

	public static void main(String[] args) {
		
		perform(new Savings());

	}

}
