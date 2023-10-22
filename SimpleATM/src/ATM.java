public class ATM implements Doable
{
    int balance = 0;
    @Override
    public void displayBalance()
    {
        System.out.println("Your current balance is: " + balance);
    }

    @Override
    public void withDraw( int amount )
    {
        if( balance + amount < 1000000 )
        {
            System.out.println("Done");
            balance += amount;
        }
        else
            System.out.println("Sorry, your account can't have more than 1000000$");
    }

    @Override
    public void deposit( int amount )
    {
        if( balance >= amount )
        {
            System.out.println("Done");
            balance -= amount;
        }
        else
            System.out.println("Sorry, you can't deposit more money than you already have :(");
    }

    @Override
    public void exit()
    {
        System.out.println("Thanks for using this ATM, Bye :)");
        System.exit(0);
    }
}
