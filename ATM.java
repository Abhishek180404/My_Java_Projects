//ATM Machine

import java.util.Scanner; 


class ATM{
		float balance = 0;
		int PIN = 1804;
		
		public void checkPin(){
			System.out.println("Enter your pin :");
			Scanner sc = new Scanner(System.in);
			int enteredpin = sc.nextInt();
			if(enteredpin == PIN){
				menu();
			}
			else{
				System.out.println("Enter a valid pin");
				System.out.println("\n");
				checkPin();
			}
			
		}
		public void menu(){
			System.out.println("Enter your choice :");
			System.out.println("1. Check A/c Balance");
			System.out.println("2. Withdraw money");
			System.out.println("3. Deposit money");
			System.out.println("4. Exit");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if(choice == 1){
				checkBalance();
			}
			else if(choice == 2){
				withdrawMoney();
			}
			else if(choice == 3){
				depositMoney();
			}
			else if(choice == 4){
				return;	
			}
			else{
				System.out.println("Enter a valid choice");
			}
		}

		public void checkBalance(){
			System.out.println("Balance :" + balance);
			System.out.println("\n");
			menu();
		}

		public void withdrawMoney(){
			System.out.println("Enter amount to withdraw :");
			Scanner sc = new Scanner(System.in);
			float amount = sc.nextFloat();
			if(amount < balance){
				balance = balance - amount;
				System.out.println("Money Withdraw Successful");
			} 
			else {
				System.out.println("Insufficient balance");
				
			}
			System.out.println("\n");
			menu();
		}
		
		public void depositMoney(){
			System.out.println("Enter amount to deposit:");
			Scanner sc = new Scanner(System.in);
			float amount = sc.nextFloat();
			balance = balance + amount;
			System.out.println("Money deposit Successful");
			System.out.println("\n");
			menu();
		}


	public static void main(String[]args){
		ATM a = new ATM();
		a.checkPin();
	}

	
}