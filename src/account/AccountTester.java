package account;
import java.util.Scanner;
/**
 *
 * @author Sivagama
 */

public class AccountTester
{

   public static void main (String[] args)
   {
      /* here assumed that 500 accounts can be created
       * for the given bank */
      Scanner scan = new Scanner(System.in);
      int b = scan.nextInt();
      System.out.println("please enter integer value of balance ");

      Account ac[] = new Account[500];

      System.out.println("Please enter the amount by which you want to open an account:");

      Scanner sc = new Scanner(System.in);
      double bal = sc.nextDouble();

      System.out.println("Please enter the unique user name:");
      sc.nextLine();
      String user = sc.nextLine();

      Account a = new Account(bal, user);
      ac[0] = a;

      System.out.println("The balance is: " + a.getBalance());
      System.out.println("The InterestRate per month is " + a.getInterestRate());
      a.interest();
   }
}
