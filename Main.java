import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        boolean running = true;

        while (running) {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Show Balance");
            System.out.println("5. Show Transaction History");
            System.out.println("6. List All Accounts");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNo = sc.next();
                    System.out.print("Enter Account Holder Name: ");
                    String holder = sc.next();
                    System.out.print("Enter Initial Deposit: ");
                    double initial = sc.nextDouble();
                    bank.createAccount(accNo, holder, initial);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.next();
                    Account acc = bank.getAccount(accNo);
                    if (acc != null) {
                        System.out.print("Enter Deposit Amount: ");
                        double dep = sc.nextDouble();
                        acc.deposit(dep);
                    } else {
                        System.out.println("Account not found......!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.next();
                    acc = bank.getAccount(accNo);
                    if (acc != null) {
                        System.out.print("Enter Withdraw Amount: ");
                        double wd = sc.nextDouble();
                        acc.withdraw(wd);
                    } else {
                        System.out.println("Account not found........!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.next();
                    acc = bank.getAccount(accNo);
                    if (acc != null) {
                        acc.showBalance();
                    } else {
                        System.out.println("Account not found........!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.next();
                    acc = bank.getAccount(accNo);
                    if (acc != null) {
                        acc.showHistory();
                    } else {
                        System.out.println("Account not found........!");
                    }
                    break;

                case 6:
                    bank.listAccounts();
                    break;

                case 7:
                    running = false;
                    System.out.println("Exiting... Thank you for using the bank system........!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.......");
            }
        }
        sc.close();
    }
}
