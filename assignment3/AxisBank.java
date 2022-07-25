package Bank;

public class AxisBank extends BankInfo {

	public void deposit()
	{
		System.out.println("We have many new net tranfer methods in our bank");
	}
	
	public static void main(String[] args) {
		
		AxisBank ab =new AxisBank();
		ab.saving();//inherited from BankInfo
		ab.fixed();//inherited from BankInfo
		ab.deposit();//override method
		
	}
}
