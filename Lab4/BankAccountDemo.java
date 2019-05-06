/**
 * Write a description of class BankAccountDemo here.
 * 
 * Sani Abubakar Sadiq
 *U15/FNS/CSC/089
 */
import java.util.Scanner;
public class BankAccountDemo
{
    public static void main(String[] args){
        Scanner bankinfo= new Scanner(System.in);
        int accountNumber;
        double balance,withdraw,deposit;
        String accountName;
        
        System.out.print("\nEnter Account Number: ");
        accountNumber=bankinfo.nextInt();
        bankinfo.nextLine();
        System.out.print("Enter Customer name: ");
        accountName=bankinfo.nextLine();
        System.out.print("Enter initial balance: ");
        balance=bankinfo.nextDouble();
        bankinfo.nextLine();
        BankAccount account= new BankAccount(accountNumber,accountName,balance);
      
       
       
        System.out.print("\nEnter amount to deposit: ");
        deposit=bankinfo.nextDouble();
        account.deposit(deposit);
        System.out.print("New balance is: "+account.getBalance());
        System.out.print("\n\nEnter amount to withdraw: ");
        withdraw=bankinfo.nextDouble();
        account.withdraw(withdraw);
        System.out.print("New balance is: "+account.getBalance());
    }
}
