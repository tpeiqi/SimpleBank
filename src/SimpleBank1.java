import java.util.Scanner;

public class SimpleBank1 {

    public static void main(String[] args){
        int exit = 0;
        Scanner input = new Scanner(System.in);
        int size = 0;
        double[] accountbalance = new double[250];
        String[] accountnames = new String[250];
        while(exit == 0) {
            System.out.println("Bank Admin Menu:");
            System.out.println("Please enter the menu option:");
            System.out.println("(1): Add customer to bank");
            System.out.println("(2): Chane customer name");
            System.out.println("(3): Check account balance");
            System.out.println("(4): Modify account balance");
            System.out.println("(5): Summary of all accounts");
            System.out.println("(-1): Quit");
            int userinput = input.nextInt();

            switch (userinput){
                case 1:
                    System.out.println("Bank Add Customer Menu:");
                    System.out.println("Please enter an account balance");
                    double balance = input.nextDouble();
                    accountbalance[size] = balance;
                    System.out.println("Please enter an account name");
                    input.nextLine();
                    String name = input.nextLine();
                    accountnames[size] = name;
                    System.out.println("Customer ID is " + size);
                    size +=1;
                    break;

                case 2:
                    System.out.println("Bank Change Name Menu");
                    System.out.println("Please enter a customer ID to change their name");
                    int index = input.nextInt();
                    System.out.println("What the the customer's new name?");
                    input.nextLine();
                    accountnames[index] = input.nextLine();
                    break;
                case 3:
                    System.out.println("Bank Check Balance Menu");
                    System.out.println("Please enter a customer ID to check their balance");
                    int index1 = input.nextInt();
                    double balance1 = accountbalance[index1];
                    System.out.println("The customer has $" + balance1 + " in their account.");
                    break;
                case 4:
                    System.out.println("Bank Modify Balance Menu");
                    System.out.println("Please enter a customer ID to check their balance");
                    int index2 = input.nextInt();
                    input.nextLine();
                    System.out.println("Please enter the new balance");
                    double balance2 = input.nextDouble();
                    accountbalance[index2] = balance2;
                    break;
                case 5:
                    System.out.println("Bank All Customer Summary Menu");
                    double total = 0;
                    for (int i = 0 ; i <= size; i++){
                        total += accountbalance[i];
                        System.out.println(accountnames[i] + " has $" + accountbalance[i] + " in their account");
                    }
                    System.out.println("There are total of $" + total + " in the bank");
                    break;
                case -1:
                    System.out.println("Exiting...");
                    exit = 1;
                    break;
                default:
                    System.out.println("Error! Please enter again");

              }

        }
    }
}
