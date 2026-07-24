package javaexamples;

public class StateBank {

	static long accountNumber = 62310100120l;
	double balanceAmount;
	String accountHolderName;
	static String IfSCcode = "SBOI1234523";
	String branchName;

	public StateBank() {
		accountNumber += 1;
	}

	public void method() {
		System.out.println("===================================");
		System.out.println("Bank Name : StateBank ");
		System.out.println("Branch Name : " + branchName);
		System.out.println("IFSC code of Bank : " + IfSCcode);
		System.out.println("Account Holder Name : " + accountHolderName);
		System.out.println("Account Number : " + (accountNumber));
		System.out.println("Available Balnace : " + balanceAmount);
		System.out.println("===================================");
	}

	public static void main(String[] args) {

		StateBank user1 = new StateBank();
		user1.accountHolderName = "Manohar Gurrampati";
		user1.balanceAmount = 50000.00;
		user1.branchName = "Hastinapuram Branch";
		user1.method();

		StateBank user2 = new StateBank();
		user2.accountHolderName = "Sai Vattikoti";
		user2.balanceAmount = 25000.00;
		user2.branchName = "Kukatpally Branch";
		user2.method();

		StateBank user3 = new StateBank();
		user3.accountHolderName = "Sravanthi Adala";
		user3.balanceAmount = 150000.00;
		user3.branchName = "Mysore Branch";
		user3.method();
	}

}
