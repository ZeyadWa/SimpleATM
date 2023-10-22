import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    static int cnt = 0;

    public static int selection()
    {
        System.out.println("Choose (1) if you want to withdraw money");
        System.out.println("Choose (2) if you want to deposit money");
        System.out.println("Choose (3) if you want to display your balance");
        System.out.println("Choose (4) if you want to exit");

        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        return n;
    }
    public static void enter()
    {
        Scanner scanner = new Scanner( System.in );
        cnt++;

        if( cnt == 10 )
        {
            System.out.println("Sorry, something went wrong please try again later :(");
            System.exit(0);
        }

        System.out.println("Enter your Id:");
        String id = "";
        id = scanner.nextLine();

        System.out.println("Enter your PIN number:");
        String PIN = "";
        PIN = scanner.nextLine();

        if( id.length() != 5 || PIN.length() != 12 )
        {
            System.out.println("Invalid id or PIN number");
            enter();
        }

        ATM a = new ATM();
        while( true )
        {
            int choice = selection();
            switch ( choice )
            {
                case 1:
                    System.out.println("Enter the amount of money you want to withdraw:");
                    int amount = scanner.nextInt();
                    a.withDraw(amount);
                    break;
                case 2:
                    System.out.println("Enter the amount of money you want to deposit:");
                    int dep = scanner.nextInt();
                    a.deposit(dep);
                    break;
                case 3:
                    a.displayBalance();
                    break;
                case 4:
                    a.exit();
                    break;
                default:
                    break;
            }
        }
    }
    public static void main( String[] args )
    {
        enter();
    }
}