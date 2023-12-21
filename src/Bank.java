import entities.Account;
import java.util.Scanner;
import java.util.Locale;

public class Bank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        Account account;
        double depositValue;
        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            depositValue = sc.nextDouble();
            account = new Account(number, holder, depositValue);
        } else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println();
        System.out.println("Enter a deposit value: ");
        depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);
        System.out.println();
        System.out.println("Enter a deposit value: ");
        double withdrawValue = sc.nextDouble();
        account.deposit(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);
        sc.close();
    }
}
