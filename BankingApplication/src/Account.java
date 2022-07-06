import java.util.Scanner;
public class Account {
    //class variables
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    // construcotr
    public Account(String cName, String cID){
        customerName = cName;
        customerID = cID;
    }
    // lets create a method for depositing money

    public void depositMoney(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }

    }
    //
    public void withdraw(int amount){
        if(amount != 0){
            balance = balance - amount;
            previousTransaction =- amount;
        }
    }
    public void getPreviousTransaction(){
         if(previousTransaction > 0){
             System.out.println("Deposited: "+ previousTransaction);
         } else if (previousTransaction < 0){
             System.out.println("withdrawn: " + Math.abs(previousTransaction) );
         }else{
             System.out.println("No transaction occured");
         }
    }
    // lets create a method to show the menu
    public  void showMenu(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, " +customerName +"!");
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println();
        System.out.println("C. Make a withdrawal");
        System.out.println("D. View previous transaction");
        System.out.println("F. Exit");
       String option =  scanner.nextLine();
// lets create the menu logic
        if(option == "A"){
             System.out.println(balance);
        } else if (option == "B") {
            System.out.println("how much would you like to deposit");
            int amount = scanner.nextInt();
            depositMoney(amount);
             System.out.println("you have successfully deposited "+amount);
        }else if(option == "C"){
            System.out.println("How much do you want to withdraw");
            int amount = scanner.nextInt();
            withdraw(amount);
        }else if(option == "D"){
            System.out.println("your previous transaction");
            int amount = scanner.nextInt();
              getPreviousTransaction();
        }
    }
}
