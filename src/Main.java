import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name, password, balance to create an account");

        String name = sc.nextLine();
        String password = sc.nextLine();
        double balance = sc.nextDouble();
        SBIuser user = new SBIuser(name,balance,password);

        System.out.println(user.addMoney(100000));

        System.out.println("Enter the money you want to withdraw");
        int money = sc.nextInt();
        System.out.println("Enter your password");

        String pass = sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        System.out.println("Your Interest is:"+user.calculateInterest(5));
    }
}