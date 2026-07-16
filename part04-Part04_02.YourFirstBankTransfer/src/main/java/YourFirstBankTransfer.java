
import java.util.ArrayList;

public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(new Account("Matthews account", 1000));
        accounts.add(new Account("My account", 0));

        System.out.println(accounts.get(0));
        System.out.println(accounts.get(1));

        {
            Account sender = accounts.get(0);
            Account receiver = accounts.get(1);
            double exchange = 100.0;
            sender.withdrawal(exchange);
            receiver.deposit(exchange);
        }

        System.out.println(accounts.get(0));
        System.out.println(accounts.get(1));
    }
}
